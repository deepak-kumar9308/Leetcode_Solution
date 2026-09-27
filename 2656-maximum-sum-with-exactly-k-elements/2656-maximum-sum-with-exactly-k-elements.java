class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        int sum=0;
        for(int n:nums){
            if(max<n){
               max=n; 
            }
        }
        for(int i=1;i<=k;i++){
            sum+=max++;
        }
    return sum;
    }
}