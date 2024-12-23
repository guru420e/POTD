class Solution {
    public int minimumMoves(String s) {
        int i,j,n;
        i = j = 0;
        n = s.size();

        int count = 0;
        while(i < n){
            if(s.charAt(i) == '0')++i;
            else{
                ++count;
                i+=3;
            }
        }

        return count;
    }
}


