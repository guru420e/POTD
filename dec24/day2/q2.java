class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0;
        for(int x : nums)
            if(x % 3 != 0)++op;
        
        return op;
    }
}