import java.io.*;
import java.util.*;

public class Main {
   public static int exp(int n){
    return 5 * n * (n  + 1);
   } 
   public static int getAns(int n, int k){
    int timeRem = 240 - k;
    int ans = 0;
    int s = 1,e = n;
    while(s <= e){
        int mid = (s + e) / 2;
        int time = exp(mid);
        if(time <= 2 * timeRem){
            ans = mid;
            s = mid + 1;
        }else e = mid - 1;
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


      int n,k;
      n = sc.nextInt();
      k = sc.nextInt();
      int x = (int)((double)-5 + Math.sqrt((double)25 + 40 * (240 - k)))/10; 
      if(x > n) out.println(n);
      else out.println(x);
     // out.println(getAns(n,k));

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