class Solution {
    public int countLargestGroup(int n) {
        int [] count = new int[37];
        int max = 0, ans = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0, temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            count[sum]++;
            if (count[sum] > max) {
                max = count[sum];
                ans = 1;
            } else if (count[sum] == max) {
                ans++;
            }
        }
        return ans;
    }
}