package Stack;

import java.util.Stack;

public class Asteroid {
    public static int[] collision(int[] arr){
        Stack<Integer> stk=new Stack<>();
        for(int num:arr){
            while(!stk.isEmpty() && num<0 && stk.peek()>0){
                int top=stk.peek();
                if(num==-top){
                    num=0;
                    stk.pop();
                    break;
                }
                else if(top>-num){
                    num=0;
                    break;
                }
                else{
                    stk.pop();
                }

            }
            if(num!=0) stk.push(num);

        }
        int[] res=new int[stk.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=stk.pop();
        }
        return res;

    }
}
