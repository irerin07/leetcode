class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) {
            map.merge(n, 1, Integer::sum);
            if (map.get(n) > 1) {
                return true;
            }
        }
        
        return false;
    }
}