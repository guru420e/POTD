class Solution {
  public boolean isThree(int n) {
    int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
    for(int i = 0;i < arr.length;++i){
      if(arr[i] * arr[i] == n)return true;
      else if(arr[i] * arr[i] > n) break;
    }

    return false;
  }
}
