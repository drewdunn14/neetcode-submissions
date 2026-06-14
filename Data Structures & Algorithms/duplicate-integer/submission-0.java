class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            if (numCount.containsKey(num)) {
                return true;
            } else {
                numCount.put(num, 0);
            }
        }
        return false;
    }
}