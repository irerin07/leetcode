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

        Integer[] ans = new Integer[1];

        inOrderTraversal(root, root.val, ans);

        return ans[0] != null ? ans[0] : -1;

    }

    public void inOrderTraversal(TreeNode node, int rootVal, Integer[] ans) {

        if (node.left != null) {

            //left and right both equals root
            if (node.left.val == node.right.val && node.left.val == rootVal) {
                inOrderTraversal(node.left, node.left.val, ans);
                inOrderTraversal(node.right, node.right.val, ans);
                return;
            }

            //left equals root
            if (node.left.val == rootVal) {
                ans[0] = findMin(node.right.val, ans[0]);
                inOrderTraversal(node.left, node.left.val, ans);
                return;
            }

            //right equals root
            if (node.right.val == rootVal) {
                ans[0] = findMin(node.left.val, ans[0]);
                inOrderTraversal(node.right, node.right.val, ans);
                return;
            }

            //left and right different from root
            if (node.left.val < node.right.val) {
                ans[0] = findMin(node.left.val, ans[0]);
                // return;
            } else {
                ans[0] = findMin(node.right.val, ans[0]);
                // return;
            }
        }
    }

    public int findMin(Integer a, Integer b) {
        if (b == null) {
            return a;
        } else if (a == null) {
            return b;
        } else {
            return Math.min(a, b);
        }
    }
}