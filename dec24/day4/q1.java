class Solution {
    public void swap(int[]arr,int m,int l){
        if(m == l)
            return;
        arr[m] = arr[m] ^ arr[l];
        arr[l] = arr[m] ^ arr[l];
        arr[m] = arr[m] ^ arr[l];
    }
    public void sortColors(int[] nums) {
        int h,m,l;       
        l = m = 0;
        h = nums.length - 1;
	

        while(m <= h){
            if(nums[m] == 1)++m;
            else if(nums[m] == 0){
                swap(nums,l,m);
                ++l;
                ++m;
            }else{
                swap(nums,h,m);
                --h;
            }
        }
    }
}
