import java.io.*;
import java.util.*;

public class Main {
   public static int[] prime;
   static{
      prime = new int[3001];
      for(int i = 2; i < 3001;i+=2)prime[i] = 2;
      
      for(int i = 3 ; i < 3001;i+=2){
         if(prime[i] == 0){
            for(int j = i; j < 3001;j+=i)
               prime[j] = i;
         }
      }
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


      int n = sc.nextInt();
      int ans = 0;
      for(int i = 6;i <= n; ++i){
         int no = i; 
         
         int count = 0,preDiv = no;
         while(no != 1){
           int div = prime[no]; 
           if(preDiv != div){
            preDiv = div;
            ++count;
           }
           no /= div;
         }
         
         if(count == 2)++ans; 
      }

      out.println(ans); 

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