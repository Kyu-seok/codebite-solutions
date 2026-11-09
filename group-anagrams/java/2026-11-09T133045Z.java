class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String serial = new String(charArr);

            if (!map.containsKey(serial)) {
                map.put(serial, new ArrayList<>());
            }

            map.get(serial).add(str);
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> list : map.values()) {
            result.add(list);
        }

        return result;
    }
}
