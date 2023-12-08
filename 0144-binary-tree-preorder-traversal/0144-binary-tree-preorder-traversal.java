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
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
            return result;   
        }
        
//         Stack<TreeNode> stack = new Stack<TreeNode>();
//         stack.push(root);
        
//         while (!stack.isEmpty()){
//             TreeNode node = stack.pop();
//             result.add(node.val);
            
//             if (node.right != null){ 
//                 stack.push(node.right);
//             }
            
//             if (node.left != null){ 
//                 stack.push(node.left);
//             }
//         }
        
        helper(root, result);
        
        return result;
    }
    
    public void helper(TreeNode node, List<Integer> result) {
        result.add(node.val);
        
        if (node.left != null) {
            helper(node.left, result);
        }
        if (node.right != null) {
            helper(node.right, result);
        }
    }
}