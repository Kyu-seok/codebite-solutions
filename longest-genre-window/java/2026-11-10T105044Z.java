class Solution {
    public int longestFreshFeed(String feed) {
        int n = feed.length();
        int l = 0;
        int r = 0;
        int longest = 0;

        Set<Character> set = new HashSet<>();

        while (r < n) {
            char c = feed.charAt(r);
            while (set.contains(c)) {
                set.remove(feed.charAt(l++));
            }
            set.add(c);
            longest = Math.max(longest, set.size());
            r++;
        }

        return longest;
    }
}
