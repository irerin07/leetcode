/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        
        if (root == null) {
            return -1;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode current = root;
        Set<Integer> set = new LinkedHashSet<>();
        
        while(current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                set.add(current.val);
                current = current.left;
            }
            
            current = stack.pop();
            set.add(current.val);
            current = current.right;
        }
        
        if (set.size() < 2) {
            return -1;
        }
        
        List<Integer> list = new ArrayList<>(set); 
        Collections.sort(list);
        
        return list.get(1);
    }
}