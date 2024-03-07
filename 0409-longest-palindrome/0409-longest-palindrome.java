class Solution {
    public int longestPalindrome(String s) {
        int answer = 0;
        Set<Character> map = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.contains(s.charAt(i))) {
                answer += 2;
                map.remove(s.charAt(i));
            } else {
                map.add(s.charAt(i));
            }

        }

        return map.isEmpty() ? answer : answer + 1;
    }
}