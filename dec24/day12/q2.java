class Solution {
  public boolean canJump(int[] nums) {
    int n = nums.length;

    int maxi = Integer.MIN_VALUE;
    for (int i = 0; i < n - 1; ++i) {
      if (nums[i] != 0) {
        maxi = Math.max(i + nums[i],maxi);
      } else if (maxi <= i)
      return false;
    }

    return true;

  }
}
