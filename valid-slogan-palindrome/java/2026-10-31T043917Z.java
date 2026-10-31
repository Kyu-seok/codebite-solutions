class Solution {
    public boolean verifyMirrorCode(String phrase) {
        phrase = phrase.toLowerCase();

        int l = 0;
        int r = phrase.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(phrase.charAt(l))) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(phrase.charAt(r))) {
                r--;
            }

            if (phrase.charAt(l) != phrase.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
