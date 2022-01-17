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
    int sum = 0;
    
    public void sumleaf(TreeNode root, int currans){
        if(root!=null){
            currans = currans<<1 | root.val;
            if(root.left == null && root.right == null){
                sum += currans;
            }
            sumleaf(root.left, currans);
            sumleaf(root.right, currans);
        }
    }
    
    public int sumRootToLeaf(TreeNode root) {
        sumleaf(root,0);
        return sum;
    }
}