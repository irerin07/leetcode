/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if( original == null ){
            // Base case aka stop condition
            // empty tree or empty node
            return null;
        }
        
        // General case:
        if( original == target ){
            // current original node is target, so is cloned
            return cloned;
        }
        
        // Either left subtree has target, or right subtree has target
        TreeNode left =  getTargetCopy(original.left, cloned.left, target);
        
        if( left != null ){ 
            return left; 
        
        }else{
            return getTargetCopy(original.right, cloned.right, target);
        }        
        
        
    }
}