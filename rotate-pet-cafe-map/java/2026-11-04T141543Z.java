class Solution {
    public void rotateParkMap(int[][] cafeMap) {
        int l = 0;
        int r = cafeMap.length - 1;

        while (l < r) {
            int top = l;
            int bottom = r;

            for (int i = 0; i < r - l; i++) {
                int topLeft = cafeMap[top][l + i];
                cafeMap[top][l + i] = cafeMap[bottom - i][l];
                cafeMap[bottom - i][l] = cafeMap[bottom][r - i];
                cafeMap[bottom][r - i] = cafeMap[top + i][r];
                cafeMap[top + i][r] = topLeft;
            }
            l++;
            r--;
        }
    }
}
