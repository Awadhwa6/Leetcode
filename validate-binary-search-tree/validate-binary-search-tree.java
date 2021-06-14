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
    public boolean isValidBST(TreeNode root) {
        long Min = Long.MIN_VALUE;
        long Max = Long.MAX_VALUE;
         
        return isValidBSTT(root.left, Min, root.val) && isValidBSTT(root.right, root.val,Max);
    }
    public boolean isValidBSTT(TreeNode root, long min, long max){
            if (root==null) {
                return true;
            }
            if(!((root.val> min) && (root.val < max))){
                return false;
            }
            return isValidBSTT(root.left, min, root.val) && isValidBSTT(root.right, root.val, max);
        }    
}