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
    int mx = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left,0,1);
        dfs(root.right,1,1);
        return mx;
    } 
    public void dfs(TreeNode root, int dir,int zlen){
        if(root == null){
            return;
        }
        mx = Math.max(mx, zlen);
        if(dir == 0){
            dfs(root.left, 0, 1);
            dfs(root.right, 1, zlen + 1);
        }
        else{
            dfs(root.left, 0, zlen + 1);
            dfs(root.right, 1, 1);
        }
    }
}