// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         if (ransomNote.length() > magazine.length()) {
//             return false;
//         }

//         if (ransomNote.equals(magazine)) {
//             return true;
//         }

//         int[] alphabets_counter = new int[26];

//         for (char c : magazine.toCharArray()) {
//             alphabets_counter[c - 'a']++;
//         }

//         for (char c : ransomNote.toCharArray()){
//             if (alphabets_counter[c-'a'] == 0) {
//                 return false;
//             }

//             alphabets_counter[c-'a']--;
//         }

//         return true;
//     }
// }

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] alphabet = new int[26];

        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, alphabet[c-'a']);
            if (i == -1) {
                return false;
            }
            alphabet[c-'a'] = i + 1;
        }

        return true;
    }
}