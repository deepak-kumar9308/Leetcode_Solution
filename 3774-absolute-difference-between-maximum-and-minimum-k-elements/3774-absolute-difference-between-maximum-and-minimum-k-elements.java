class Solution {
    public int absDifference(int[] nums, int k) {
      Arrays.sort(nums);
      int summax=0;
      int summin=0;
      int n=nums.length;
      for(int i=0,j=n-k;i<k;i++,j++){
            summin+=nums[i];
            summax+=nums[j];
      }  
      return Math.abs(summax-summin);
    }
}