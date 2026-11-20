class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int ans = arr[arr.length-1];
        return ans;
    }
}
