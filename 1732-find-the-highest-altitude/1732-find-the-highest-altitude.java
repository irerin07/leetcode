class Solution {
    public int largestAltitude(int[] gain) {
        int answer = 0;

        int[] ints = new int[gain.length + 1];
        ints[0] = 0;

        for (int i = 1; i < ints.length; i++) {
            ints[i] = gain[i - 1] + ints[i-1];
            if (answer < ints[i]) {
                answer = ints[i];
            }
        }

        return answer;
    }
}