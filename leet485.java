public class leet485 {
    public int main(int [] nums) {
        int max_one = 0;
        int curr = 0;

        for (int num = 0; num < nums.length; num++) {
            if (nums[num] == 1) {
                curr += 1;
            } else {
                curr = 0;
            }
            max_one = Math.max(max_one, curr);
        }
        return max_one;
    }
}
