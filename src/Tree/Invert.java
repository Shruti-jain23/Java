package Tree;

public class Invert {
    public TreeNode inv(TreeNode root){
        if(root!=null) return root;
        TreeNode lefttree=inv(root.left);
        TreeNode righttree=inv(root.right);
        root.left=righttree;
        root.right=lefttree;
        return root;

    }
}
