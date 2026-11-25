class Solution {
    public int[] findPairIndices(int[] snacks, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < snacks.length; i++) {
            int num = snacks[i];
            int pair = target - num;

            if (map.containsKey(pair)) {
                return new int[] {i, map.get(pair)};
            } else {
                map.put(num, i);
            }
        }

        return null;
    }
}
