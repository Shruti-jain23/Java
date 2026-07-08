package Tree;
import java.util.*;

public class Symmetric {
    public static boolean issym(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        while(root!=null){
            int lvl=queue.size();
            for(int i=0;i<lvl;i++){
                TreeNode left=queue.poll();
                TreeNode right=queue.poll();
                if(left==null && right==null) continue;
                if(left==null || right==null) return false;
                if(left.val!=right.val) return false;
                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);

            }
        }
        return true;

    }
}
