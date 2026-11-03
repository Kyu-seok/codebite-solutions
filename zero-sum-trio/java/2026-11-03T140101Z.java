class Solution {
    public List<List<Integer>> triageZeroPriority(int[] deltas) {
        int n = deltas.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(deltas);

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && deltas[i] == deltas[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                int sum = deltas[i] + deltas[l] + deltas[r];
                if (sum == 0) {
                    result.add(List.of(deltas[i], deltas[l], deltas[r]));
                    l++;
                    r--;

                    while (l < r && deltas[l] == deltas[l - 1]) {
                        l++;
                    }
    
                    while (l < r && deltas[r] == deltas[r + 1]) {
                        r--;
                    }
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
