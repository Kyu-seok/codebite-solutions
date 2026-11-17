class Solution {
    public int longestSameLetterRun(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // Expand window
            freq[rightChar - 'A']++;

            // Track highest frequency in window (historical max)
            maxFreq = Math.max(maxFreq, freq[rightChar - 'A']);

            // Shrink window if invalid
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
