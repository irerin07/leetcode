class Solution {
    public static boolean isPalindrome(String s) {
        String lowerCase = s.replaceAll(
                "[^a-zA-Z0-9]", "").toLowerCase();

        if (lowerCase.isBlank()) {
            return true;
        }

        int head = 0;
        int tail = lowerCase.length() - 1;

        while (head < tail) {
            if (lowerCase.charAt(head) != lowerCase.charAt(tail)) {
                return false;
            }

            head += 1;
            tail -= 1;
        }

        return true;
    }
}