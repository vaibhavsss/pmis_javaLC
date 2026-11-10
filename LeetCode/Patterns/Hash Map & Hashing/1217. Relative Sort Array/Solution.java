class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int x : arr1) count[x]++;
        int i = 0;
        for (int x : arr2)
            while (count[x]-- > 0) arr1[i++] = x;
        for (int x = 0; x < 1001; x++)
            while (count[x]-- > 0) arr1[i++] = x;
        return arr1;
    }
}