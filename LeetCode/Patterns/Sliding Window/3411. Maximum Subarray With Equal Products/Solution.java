class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            long p = 1, g = 0, l = 1;
            for (int j = i; j < n; j++) {
                p *= nums[j];
                g = g == 0 ? nums[j] : gcd(g, nums[j]);
                l = l * nums[j] / gcd(l, nums[j]);
                if (p == g * l) ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    
    }
}