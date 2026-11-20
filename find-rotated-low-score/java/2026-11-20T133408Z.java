class Solution {
    public int findLowestScore(int[] scores) {
        int l = 0;
        int r = scores.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (scores[m] > scores[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return scores[l];
    }
}
