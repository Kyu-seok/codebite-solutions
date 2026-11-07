class Solution {
    public int maxTempSwing(int[] readings) {
        int n = readings.length;
        // if (n == 1) return 0;

        int maxJump = Integer.MIN_VALUE;
        int currMax = readings[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            int curr = readings[i];
            if (curr < currMax) {
                maxJump = Math.max(maxJump, currMax - curr);
            }
            currMax = Math.max(currMax, curr);
        }

        return (maxJump == Integer.MIN_VALUE) ? 0 : maxJump;
    }
}
