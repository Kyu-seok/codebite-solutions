class Solution {
    public int kthHighestScore(int[] scores, int k) {
        Arrays.sort(scores);

        return scores[scores.length - k];
    }
}
