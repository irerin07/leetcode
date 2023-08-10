class Solution {
public int removeElement(int[] nums, int val) {
    int answer = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        int temp = nums[answer];
        nums[answer] = nums[i];
        nums[i] = temp;
        answer++;
      }
    }
    return answer;
  }
}