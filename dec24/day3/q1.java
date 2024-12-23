class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] clone = nums.clone();				
		Arrays.sort(clone);

		HashMap<Integer,Integer> mp = new HashMap<>();
		for(int i = 0; i < clone.length;++i)
			if(!mp.containsKey(clone[i]))
				mp.put(clone[i],i);
			
		
		int k = 0;
		for(int i = 0; i < nums.length;++i){
			int firstIndex = mp.get(nums[i]);
			clone[k++] = firstIndex;
		}

		return clone;

	}
}
