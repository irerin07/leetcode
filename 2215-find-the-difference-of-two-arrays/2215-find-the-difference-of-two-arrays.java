// class Solution {
//     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//         List<List<Integer>> answers = new ArrayList<>();
//         Set<Integer> left = new HashSet<>();
//         Set<Integer> right = new HashSet<>();

//         for (int i : nums1) {
//             boolean test = test(i, nums2);
//             if (!test) {
//                 left.add(i);
//             }
//         }

//         for (int i : nums2) {
//             boolean test = test(i, nums1);
//             if (!test) {
//                 right.add(i);
//             }
//         }

//         answers.add(new ArrayList<>(left));
//         answers.add(new ArrayList<>(right));

//         return answers;
//     }

//     private boolean test(int num1, int[] nums2) {
//         for (int i : nums2) {
//             if (num1 == i) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }

class Solution {
     
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }
    
      // Returns the elements in the first arg nums1 that don't exist in the second arg nums2.
    List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<> (); 
        
        // Store nums2 elements in an unordered set. 
        Set<Integer> existsInNums2 = new HashSet<> (); 
        for (int num : nums2) {
            existsInNums2.add(num);
        }
        
        // Iterate over each element in the list nums1.
        for (int num : nums1) {
            if (!existsInNums2.contains(num)) {
                onlyInNums1.add(num);
            }
        }
        
        // Convert to vector.
        return new ArrayList<>(onlyInNums1);
    }
}