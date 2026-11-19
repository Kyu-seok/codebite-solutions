class Solution {
    public boolean hasPrice(int[][] menu, int target) {
        int m = menu.length;
        int n = menu[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / n;
            int col = mid % n;

            if (menu[row][col] == target) {
                return true;
            } else if (menu[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
