class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();

        int index = 0;

        for (int num : nums) {
            map.put(num, index);
            index += 1;
        }

        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];
            if (map.get(i1) != null && map.get(i1) != i) {
                ints[0] = i;
                ints[1] = map.get(i1);
                break;
            }
        }

        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }

        return ints;
    }
}