package Tree;
import java.util.*;

public class LevelOrder {
    public static List<List<Integer>> level(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int lvl=queue.size();
            List<Integer> currlist=new ArrayList<>();
            for(int i=0;i<lvl;i++){
                TreeNode curr=queue.poll();
                currlist.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);



            }
            res.add(currlist);
        }
        return res;


    }

}
