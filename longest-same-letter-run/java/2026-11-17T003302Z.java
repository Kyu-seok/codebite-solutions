class Solution {

    int longest = 1;
    int k;

    public int longestSameLetterRun(String s, int k) {
        this.k = k;

        dfs(s, s.charAt(0), 1, 1, k);

        return longest;
    }

    private void dfs(String s, char c, int i, int size, int changeLeft) {
        if (changeLeft < 0) return;
        
        longest = Math.max(longest, size);
        
        if (i >= s.length()) return;

        if (s.charAt(i) == c) {
            dfs(s, c, i + 1, size + 1, changeLeft);
        } else {
            dfs(s, c, i + 1, size + 1, changeLeft - 1);
            dfs(s, s.charAt(i), i + 1, 1, k);
        }
    }
}
