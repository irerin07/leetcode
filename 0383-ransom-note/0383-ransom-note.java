import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // if (ransomNote.length() > magazine.length()) {
        //     return false;
        // }
        // Pattern pattern = Pattern.compile(magazine.toString());
        // Matcher matcher = pattern.matcher(ransomNote);
        // if(matcher.find()){
        //     return !matcher.find();
        // }
        // return false;
        // HashMap<Character, Integer> result = new HashMap<>();
        // for(char c : ransomNote.toCharArray()){
        //     result.put(c,result.getOrDefault(c,0)+1);
        // }
        // for(char c : magazine.toCharArray()){
        //     if(result.containsKey(c)){
        //         result.put(c,result.getOrDefault(c,0)-1);
        //     }
        // }
        // for(int val : result.values()){
        //     if(val > 0){
        //         return false;
        //     }
        // }
        // return true;
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}