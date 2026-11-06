class Solution {
    public int frameLargestBale(int[] lockers) {
        int l = 0;
        int r = lockers.length - 1;

        int maxArea = Integer.MIN_VALUE;

        while (l < r) {
            int h = Math.min(lockers[l], lockers[r]);
            maxArea = Math.max(maxArea, h * (r - l));

            if (lockers[l] < lockers[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
