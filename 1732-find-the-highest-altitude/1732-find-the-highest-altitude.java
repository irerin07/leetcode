// class Solution {
//     public int largestAltitude(int[] gain) {
//         int answer = 0;

//         int[] ints = new int[gain.length + 1];
//         ints[0] = 0;

//         for (int i = 1; i < ints.length; i++) {
//             ints[i] = gain[i - 1] + ints[i-1];
//             if (answer < ints[i]) {
//                 answer = ints[i];
//             }
//         }

//         return answer;
//     }
// }
class Solution {
  public int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    // Highest altitude currently is 0.
    int highestPoint = currentAltitude;

    for (int altitudeGain : gain) {
      // Adding the gain in altitude to the current altitude.
      currentAltitude += altitudeGain;
      // Update the highest altitude.
      highestPoint = Math.max(highestPoint, currentAltitude);
    }

    return highestPoint;
  }
}