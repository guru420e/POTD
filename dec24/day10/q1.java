class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[]ans = new int[nums.length];
    int pre,suff;
    pre = suff = 1;
    for(int i = 0; i < nums.length;++i)ans[i]=1;
    for(int i = 0,j = nums.length - 1;i < nums.length && j >= 0 ; ++i,--j){
      ans[i]*= pre;
      ans[j]*= suff;

      pre*=nums[i];
      suff*=nums[j];
    }

    return ans;
  }
}


