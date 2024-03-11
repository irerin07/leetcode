// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for(int n : nums) {
//             map.merge(n, 1, Integer::sum);
//             if (map.get(n) > 1) {
//                 return true;
//             }
//         }
        
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> seen = new HashSet<>();
//         for (int num : nums) {
//             if (seen.contains(num))
//                 return true;
//             seen.add(num);
//         }
//         return false;
//     }
// }