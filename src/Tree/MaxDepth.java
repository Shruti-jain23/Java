package Tree;

public class MaxDepth {
    public static int depth(TreeNode root){
        if(root==null) return 0;
        int left=depth(root.left);
        int right=depth(root.right);
        int max=Math.max(left,right)+1;
        return max;
    }
}
