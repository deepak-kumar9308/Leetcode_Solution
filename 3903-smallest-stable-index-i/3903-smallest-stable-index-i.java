class Solution {
    public int firstStableIndex(int[] nums, int s) {
        for(int i=0;i<nums.length;i++){
              int max=nums[0];
            for(int j=0;j<=i;j++){
                if(max<nums[j]){
                    max=nums[j];
                }
            }
             int min=nums[i];
            for(int k=i;k<nums.length;k++){
                if(min>nums[k]){
                    min=nums[k];
                }
            }
            if((max-min)<=s){
                return i;
            }
        }
        return -1;
    }
}