package Tree;
import java.util.*;

public class rightview {
    public static List<Integer> right(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int lvl=queue.size();
            for(int i=0;i<lvl;i++){
                TreeNode curr=queue.poll();
                if(i==lvl-1) res.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);


            }

        }
        return res;

    }
}
