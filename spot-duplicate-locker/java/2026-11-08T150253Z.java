class Solution {
    public boolean detectClash(int[] lockers) {
        Set<Integer> set = new HashSet<>();

        for (int locker : lockers) {
            if (set.contains(locker)) {
                return true;
            }

            set.add(locker);
        }

        return false;
    }
}
