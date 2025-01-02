class Solution {
  public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    int idx = 0;
    int n = strs.length - 1;
    while(idx < strs[0].length() && idx < strs[n].length()){
      if(strs[0].charAt(idx) == strs[n].charAt(idx))++idx;
      else break;
    }

    return strs[0].substring(0,idx );
  }
}
