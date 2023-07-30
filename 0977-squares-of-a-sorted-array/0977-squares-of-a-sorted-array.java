import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++){
      answer[i] = nums[i] * nums[i];
    }
    
    answer = Arrays.stream(answer).sorted().toArray();
    
    return answer;
    }
}