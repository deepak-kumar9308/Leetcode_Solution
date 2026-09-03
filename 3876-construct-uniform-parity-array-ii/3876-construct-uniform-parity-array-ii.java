class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;

        // Find the smallest ODD number
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 1) {
                minOdd = Math.min(nums1[i], minOdd);
            }
        }  
        if (minOdd == Integer.MAX_VALUE) {
         return true;
}

        // Check if there is an EVEN number smaller than minOdd
        for (int x : nums1) {
            if (x % 2 == 0 && x < minOdd) {
                return false;
            }
        }

        return true;
    }
}