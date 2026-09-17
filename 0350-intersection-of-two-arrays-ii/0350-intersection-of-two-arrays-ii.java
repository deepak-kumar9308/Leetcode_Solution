class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int res[]=new int[Math.min(m,n)];
        int k=0;

        boolean used[]=new boolean[m];
    
            for(int num:nums1){
                for(int i=0;i<m;i++){
                    if(num==nums2[i] && !used[i]){
                        res[k++]=num;
                        used[i]=true;
                        break;
                    }
                }
            }

        return Arrays.copyOf(res,k);
    }
}