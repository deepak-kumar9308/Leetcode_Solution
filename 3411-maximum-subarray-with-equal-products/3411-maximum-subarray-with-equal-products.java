
class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;

        int ans = (n >= 2) ? 2 : (nums[0] == 1 ? 1 : 0);

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                boolean good = true;

                for (int k = i; k <= j; k++) {
                    for (int l = k + 1; l <= j; l++) {

                        if (gcd(nums[k], nums[l]) != 1) {
                            good = false;
                            break;
                        }
                    }

                    if (!good) break;
                }

                if (good) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
