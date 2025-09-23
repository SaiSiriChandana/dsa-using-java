/**
 * Definition for a binary tree node.
 public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        thi.left=left;
        this.right=right;
    }
 }
 
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
    private void preorder(TreeNode node,List<Integer> res){
        if(node==null) return;
        res.add(node.val);//root 
        preorder(node.left,res);//left
        preorder(node.right,res);//right
    }
}
