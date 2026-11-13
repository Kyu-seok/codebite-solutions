class Solution {
    public int[][] mergeSeatingWindows(int[][] seatings) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(seatings, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        int start = seatings[0][0];
        int end = seatings[0][1];

        for (int i = 1; i < seatings.length; i++) {
            if (end < seatings[i][0]) {
                list.add(new int[] {start, end});
                start = seatings[i][0];
                end = seatings[i][1];
            } else {
                end = Math.max(end, seatings[i][1]);
            }
        }

        list.add(new int[] {start, end});

        int[][] result = list.toArray(new int[0][]);

        return result;
    }
}
