class Solution {
    public int[] computeStationShare(int[] rates) {
        int n = rates.length;
        int[] result = new int[n];

        Arrays.fill(result, 1);

        int prefixMul = 1;

        for (int i = 0; i < n; i++) {
            result[i] *= prefixMul;
            prefixMul *= rates[i];
        }

        int postfixMul = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= postfixMul;
            postfixMul *= rates[i];
        }

        return result;
    }
}
