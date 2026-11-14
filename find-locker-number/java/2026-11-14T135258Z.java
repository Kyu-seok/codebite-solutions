class Solution {
    public int locateCallNumber(int[] shelf, int target) {
        int l = 0;
        int r = shelf.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (shelf[m] == target) {
                return m;
            } else if (shelf[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}
