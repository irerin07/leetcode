class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size = Math.max(word1.length(), word2.length());

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < size; i++) {
                if (i >= word1.length()) {
                    sb.append(word2.charAt(i));
                    continue;
                }

                if (i >= word2.length()) {
                    sb.append(word1.charAt(i));
                    continue;
                }

                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }

            return sb.toString();
    }
}