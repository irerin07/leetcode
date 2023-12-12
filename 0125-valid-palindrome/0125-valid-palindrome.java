class Solution {
    public boolean isPalindrome(String s) {
    
        int startPosition = 0;
        int lastPosition = s.length() -1;
        
        while (startPosition <= lastPosition) {
            char currFirst = s.charAt(startPosition);
            char currLast = s.charAt(lastPosition);
            
            if (!Character.isLetterOrDigit(currFirst)) {
                startPosition++;
                continue;
            }
            
            if (!Character.isLetterOrDigit(currLast)) {
                lastPosition--;
                continue;
            }
            
            if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        		return false;
        	}
            
            startPosition++;
            lastPosition--;
        }
        
        return true;
    }
}