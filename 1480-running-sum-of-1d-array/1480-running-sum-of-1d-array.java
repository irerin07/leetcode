class Solution {
    public int[] runningSum(int[] nums) {
        // int[] ans = new int[nums.length];
        // ans[0] = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     int i1 = ans[i - 1] + nums[i];
        //     ans[i] = i1;
        // }
        // return ans;
                // int i = 1;
        // while (i<nums.length){
        //     nums[i]+=nums[i-1];
        //     i++;
        // }
        // return nums;

        for(int i=1; i<nums.length ; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}