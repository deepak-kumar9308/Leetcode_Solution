class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        int numDigits = String.valueOf(nums[0]).length();
        long totalDiff = 0;

        for (int pos = 0; pos < numDigits; pos++) {
            int[] freq = new int[10];
            for (int i = 0; i < n; i++) {
                freq[nums[i] % 10]++;
                nums[i] /= 10;
            }
            for (int count : freq) {
                totalDiff += (long) count * (n - count);
            }
        }

        return totalDiff / 2;
    }
}
