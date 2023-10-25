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
    public TreeNode sortedArrayToBST(int[] nums) {
    return createBST(nums, 0 , nums.length - 1);
    }

    private TreeNode createBST(int[] nums, int l , int r){
        if(l>r) return null;
        int mid = r + (l-r)/2;

        TreeNode head = new TreeNode(nums[mid]);        
        head.left = createBST(nums, l, mid-1);
        head.right = createBST(nums, mid + 1, r);

        return head;        
    }
}