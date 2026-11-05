class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int x : arr1) {
            if (isValid(arr2, x, d)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(int[] arr2, int x, int d) {
        int l = 0;
        int r = arr2.length - 1;

        while (l <= r) {
            int mid = l + (r-l) / 2;

            if (Math.abs(arr2[mid] - x) <= d) {
                return false;
            }

            if (arr2[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return true;
    }
}