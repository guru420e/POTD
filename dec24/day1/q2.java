class Solution {
    public static int gcd(int a, int b) {
        // Learn about the euclid alog
        // 48 = 18 * 2 + 12
        // 18 = 12 * 1 + 6
        // 12 = 6 * 2 + 0
        // 6 = 0 * 6 + 6
        // s == 0 break;
        // ans = l
        
        int l = Math.max(a,b);
        int s = Math.min(a,b);
        
        while(s != 0){
            int r = l % s;
            l = s;
            s = r;
        }
        
        return l;
    }
}
        