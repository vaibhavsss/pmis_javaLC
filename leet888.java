import java.util.Arrays;

public class leet888 {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int sumA = 0, sumB = 0;

        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;

        int diff = (sumA - sumB) / 2;

        int i = 0, j = 0;

        while (i < aliceSizes.length && j < bobSizes.length) {
            int currentDiff = aliceSizes[i] - bobSizes[j];

            if (currentDiff == diff) {
                return new int[]{aliceSizes[i], bobSizes[j]};
            } else if (currentDiff < diff) {
                i++;
            } else {
                j++;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};

        int[] result = fairCandySwap(aliceSizes, bobSizes);

        System.out.println(result[0] + " " + result[1]);
    }
}