class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals(magazine)) {
            return true;
        }

        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = magazine.toCharArray();
        for (char c : charArray) {
            map.merge(c, 1, Integer::sum);
        }

        char[] charArray1 = ransomNote.toCharArray();
        for (char c : charArray1) {
            if (map.get(c) == null || map.get(c) == 0) {
                return false;
            }

            map.merge(c, -1, Integer::sum);
        }

        return true;
    }
}