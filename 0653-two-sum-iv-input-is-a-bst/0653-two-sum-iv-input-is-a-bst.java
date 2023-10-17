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
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, new HashSet<>(), k);
    }
    
    public boolean dfs(TreeNode node, Set<Integer> set, int target) {
        if (set.contains(target - node.val)) {
            return true;
        }
        
        boolean res = false;
        
        set.add(node.val);
        
        if (node.left != null) {
            res = dfs(node.left, set, target);
        }
        if (!res && node.right != null) {
            res = dfs(node.right, set, target);
        }
        
        return res;
    }
}