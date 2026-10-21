class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length==0) return 0;

        int totalGap = 0;
        for (int i = 0; i < timeSeries.length-1; i++){
            totalGap += Math.min(duration, timeSeries[i+1] - timeSeries[i]);
        }
        if (timeSeries.length > 0){
            return totalGap += duration;
        }
        return totalGap;
}
}