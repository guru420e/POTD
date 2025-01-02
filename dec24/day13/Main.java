import java.io.*;
import java.util.*;

public class Main {
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

    int ele = -1; 
    int ans = 0;
    for(int i = 0; i < k;++i){
      int x = sc.nextInt();
      if(x > 0) ++ans;
      else {
        out.printf("%d",ans);
        out.close();
        return;
      }

      if(i == k - 1)ele = x;
    }

    for(int i = 0; i < n - k; ++i){
      int x = sc.nextInt();
      if(x == 0)break;
      else if(ele == x)++ans;
    }
    out.printf("%d",ans);

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
