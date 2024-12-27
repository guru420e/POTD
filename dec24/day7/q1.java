class Solution {
    public int getSquaredSumDigit(int n){
        int sum = 0;
        while(n != 0){
            int d = n % 10;
            n /= 10;
            sum+= d * d;
        }
        
        return sum;
    }
    public boolean isHappy(int n) {
        int n1 = n;
        while(n != 1){
            int a = getSquaredSumDigit(n);
            int b = getSquaredSumDigit(getSquaredSumDigit(n1));
            
            n = a;
            n1 = b;
             
            if(a == b) return false;
        }
        
        return true;
    }
} 
