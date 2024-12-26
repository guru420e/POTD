class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i,j,count;
        i = j = count = 0;
        while(j < s.length && i < g.length){
            if(s[j] >= g[i]){
                ++count;
                ++i;
                ++j;
            }else 
                ++j;
        }

        return count;
    }
}
