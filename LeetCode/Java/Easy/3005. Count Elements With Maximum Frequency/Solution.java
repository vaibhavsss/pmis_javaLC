class Solution {
    public int maxFrequencyElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length;
        int i = 0;
        int maxFreq = 0;
        int total = 0;

        while (i < n) {
            int j = i + 1;
            
            while (j < n && nums[i] == nums[j]) {
                j++;
            }

            int count = j - i;

            if (count > maxFreq) {
                maxFreq = count;
                total = count;
            } else if (count == maxFreq) {
                total += count;

            } i = j;
        } return total;
    }
}