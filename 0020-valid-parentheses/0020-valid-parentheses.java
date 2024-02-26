class Solution {
    public boolean isValid(String s) {
Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        char[] charArray = s.toCharArray();
        if (charArray[0] == '}' || charArray[0] == ')' || charArray[0] == ']' ) {
            return false;
        }

        for (char c : charArray) {
            if (c == '{' || c == '(' || c == '[' ) {
                stack.push(c);
            }

            if (c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack2.push(c);
                }
            }

            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack2.push(c);
                }
            }

            if ( c == ']' ) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack2.push(c);
                }
            }
        }

        return stack.isEmpty() && stack2.isEmpty();
    }
}