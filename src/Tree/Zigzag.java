package Tree;

import java.util.*;

public class Zigzag {
    public static List<List<Integer>> spiral(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean rev=false;
        while(!queue.isEmpty()){
            int lvl=queue.size();
            List<Integer> currlist=new ArrayList<>();
            for(int i=0;i<lvl;i++){
                if(!rev){
                    TreeNode curr=queue.pollFirst();
                    currlist.add(curr.val);
                    if(curr.left!=null) queue.addLast(curr.left);
                    if(curr.right!=null) queue.addLast(curr.right);
                }
                else {
                    TreeNode curr = queue.pollLast();
                    currlist.add(curr.val);

                    if (curr.right != null) queue.addFirst(curr.right);
                    if (curr.left != null) queue.addFirst(curr.left);
                }
            }
            rev=!rev;
            res.add(currlist);

        }
        return res;

    }

}
