class Solution {
    public boolean verifyMirrorCode(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll("[^a-z0-9]", "");

        int l = 0;
        int r = phrase.length() - 1;

        while (l < r) {
            if (phrase.charAt(l++) != phrase.charAt(r--)) return false;
        }

        return true;
    }
}
