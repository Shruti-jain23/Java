package Tree;

import java.util.*;


public class Avglvl {
    public static List<Double> avg(TreeNode root){
        List<Double> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        double avg=0;
        while(!queue.isEmpty()){
            int lvl=queue.size();
            int sum=0;
            avg=0;
            for(int i=0;i<lvl;i++){
                TreeNode curr=queue.poll();
                sum+=curr.val;
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            avg=(double)sum/lvl;
            res.add(avg);
        }
        return res;
    }
}
