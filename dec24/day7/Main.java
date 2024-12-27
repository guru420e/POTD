import java.io.*;
import java.util.*;

public class Main {
    public static long getAns(long n){
      long i = 1;
      while(n % i == 0)++i;
      return i - 1;
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
    while(t-- > 0){
        long n = sc.nextLong();
        out.println(getAns(n));
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