class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int num:nums){
            if(max<num){
                max=num;
            }
        }
        int count=0;
        for(int num:nums){
           while(num!=max){
            num++;
            count++;
           }
        }
        return count;
    }
}