class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack stack1 = new Stack<>();
        Stack stack2 = new Stack<>();
        
        for(int i = 0; i<s.length(); i++) {
            if (s.charAt(i) != '#') {
                stack1.add(s.charAt(i));
            }
            if (!stack1.isEmpty() && s.charAt(i) == '#') {
                stack1.pop();
            }
        }
        
        for(int i = 0; i<t.length(); i++) {
            if (t.charAt(i) != '#') {
                stack2.add(t.charAt(i));
            }
            if (!stack2.isEmpty() && t.charAt(i) == '#') {
                stack2.pop();
            }
        }
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(!stack1.isEmpty()){
            sb1.append(stack1.pop().toString());
        }
        
        while(!stack2.isEmpty()){
            sb2.append(stack2.pop().toString());
        }
        
        return sb1.toString().equals(sb2.toString());
    }
}