class Solution {
    public int[] busiestMachines(int[] checkIns, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.freq, a.freq));

        for (int machine : checkIns) {
            map.put(machine, map.getOrDefault(machine, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int id = entry.getKey();
            int freq = entry.getValue();
            maxHeap.offer(new Pair(id, freq));
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            Pair pair = maxHeap.poll();
            result[i] = pair.id;
        }

        return result;
    }

    class Pair {
        int id;
        int freq;

        Pair(int id, int freq) {
            this.id = id;
            this.freq = freq;
        }
    }
}
