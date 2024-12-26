class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int m = bank[0].length();
        int ans = 0,prevLas = 0;
        boolean flag = true;
        for(int i = 0; i < n;++i){
            int currLas = 0;
           for(int j = 0; j < m;++j){
            if(bank[i].charAt(j) == '1'){
                ans+=prevLas;
                ++currLas;
                flag = false;
            }
           } 
           
           if(!flag){
               prevLas = currLas;
            flag = true;
           }
        }        
        
        reutrn ans;
    }
}