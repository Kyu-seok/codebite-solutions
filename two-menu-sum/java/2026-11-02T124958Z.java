class Solution {
    public int[] pairTiersBudget(int[] menuPrice, int budget) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < menuPrice.length; i++) {
            int price = menuPrice[i];
            int pair = budget - price;

            if (map.containsKey(pair)) {
                return new int[] {map.get(pair) + 1, i + 1};
            }

            map.put(price, i);
        }

        return null;
    }
}
