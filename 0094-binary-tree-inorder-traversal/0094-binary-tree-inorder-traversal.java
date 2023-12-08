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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        
        // Stack<TreeNode> stack = new Stack<>();
        
        if (root == null) {
            return answer;
        }
        
//         TreeNode current = root;
        
//         while(current != null || !stack.isEmpty()) {
//             while (current != null) {
//                 stack.push(current);
//                 current = current.left;
//             }
            
//             current = stack.pop();
//             answer.add(current.val);
//             current = current.right;
//         }
        
//         return answer;
        helper(root, answer);
        
        return answer;
    
    }
    
    public void helper(TreeNode node, List<Integer> answer) {
        if (node.left != null) {
            helper(node.left, answer);
        }
        
        answer.add(node.val);
            
        if (node.right != null) {
            helper(node.right, answer);
        }
    }
}