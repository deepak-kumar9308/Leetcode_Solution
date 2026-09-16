class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37];
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            freq[sum]++;
        }
        int max = 0;
        for (int count : freq) {
            max = Math.max(max, count);
        }
        int result = 0;
        for (int count : freq) {
            if (count == max) {
                result++;
            }
        }
        return result;
    }
    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
