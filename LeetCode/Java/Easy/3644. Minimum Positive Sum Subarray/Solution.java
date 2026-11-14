class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = -1, n = nums.size();
        for (int len = l; len <= r; len++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += nums.get(i);
                if (i >= len) sum -= nums.get(i - len);
                if (i >= len - 1 && sum > 0) {
                    if (min == -1 || sum < min) min = sum;
                }
            }
        }
        return min;
    }
}