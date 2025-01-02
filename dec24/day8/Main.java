import java.io.*;
import java.util.*;

public class Main {
   public static int gcd(int a, int b) {
      if (b == 0)
         return a;
      return gcd(b, a % b);
   }

   public static int getGcd(int[] arr) {
      int n = arr.length;

      int ans = gcd(arr[0], arr[1]);
      for (int i = 2; i < n; ++i) {
         ans = gcd(ans, arr[i]);
      }

      return ans;
   }

   public static void main(String[] args) throws IOException {
      boolean isLocal = System.getProperty("ONLINE_JUDGE") == null;
      FastScanner sc;
      PrintWriter out;

      if (isLocal) {
         sc = new FastScanner("input.txt");
         out = new PrintWriter(new FileWriter("output.txt"));
      } else {
         sc = new FastScanner();
         out = new PrintWriter(System.out);
      }

      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n; ++i)
            arr[i] = Math.abs(sc.nextInt() - (i + 1));

         out.println(getGcd(arr));
      }

      out.close();
   }

   public static class FastScanner {
      BufferedReader br;
      StringTokenizer st;

      public FastScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }

      public FastScanner(String fileName) throws FileNotFoundException {
         br = new BufferedReader(new FileReader(fileName));
      }

      String next() {
         while (st == null || !st.hasMoreElements()) {
            try {
               st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
         return st.nextToken();
      }

      int nextInt() {
         return Integer.parseInt(next());
      }

      long nextLong() {
         return Long.parseLong(next());
      }

      double nextDouble() {
         return Double.parseDouble(next());
      }

      String nextLine() {
         String str = "";
         try {
            str = br.readLine();
         } catch (IOException e) {
            e.printStackTrace();
         }
         return str;
      }
   }
}