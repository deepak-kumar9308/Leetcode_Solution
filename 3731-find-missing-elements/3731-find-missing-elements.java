class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int j = 0;
        for (int i = nums[0]; i < nums[nums.length - 1]; i++) {
            if (nums[j] == i) {
                j++;
            } else {
                res.add(i);
            }
        }
        return res;
    }
}