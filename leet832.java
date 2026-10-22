public class leet832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            int left =0;
            int right = row.length-1;

            while (left<=right) {
                int temporary = row[left];

                row[left] = 1 - row[right];
                row[right] = 1 - temporary;

                left++;
                right--;
            }
        }
        return image;
    }
}
}
