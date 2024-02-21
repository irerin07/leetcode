class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answers = new ArrayList<>();
        Set<Integer> left = new HashSet<>();
        Set<Integer> right = new HashSet<>();

        for (int i : nums1) {
            boolean test = test(i, nums2);
            if (!test) {
                left.add(i);
            }
        }

        for (int i : nums2) {
            boolean test = test(i, nums1);
            if (!test) {
                right.add(i);
            }
        }

        answers.add(new ArrayList<>(left));
        answers.add(new ArrayList<>(right));

        return answers;
    }

    private boolean test(int num1, int[] nums2) {
        for (int i : nums2) {
            if (num1 == i) {
                return true;
            }
        }

        return false;
    }
}