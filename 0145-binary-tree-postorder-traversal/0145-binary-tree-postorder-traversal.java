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
    public List<Integer> postorderTraversal(TreeNode root) {
	    LinkedList<Integer> ans = new LinkedList<>();
	    // Stack<TreeNode> stack = new Stack<>();
        
	    if (root == null) { 
            return ans;
        }
        
// 	    stack.push(root);
        
// 	    while (!stack.isEmpty()) {
// 		    TreeNode cur = stack.pop();
// 		    ans.addFirst(cur.val);
            
// 		    if (cur.left != null) {
// 			    stack.push(cur.left);
// 		    }
            
// 		    if (cur.right != null) {
// 			    stack.push(cur.right);
// 		    } 
            
// 	    }
        
        helper(root, ans);
        
	    return ans;
    }
    
    public void helper(TreeNode node, LinkedList<Integer> ans) {
        if (node.left != null) {
            helper(node.left, ans);
        }
        
        if (node.right != null) {
            helper(node.right, ans);
        }
        
        ans.add(node.val);
    }
    
}