package Stack;

import java.util.Stack;

public class PreviousGreater {
    public static int[] prevg(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int[] prev=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[stk.peek()]<=arr[i]) stk.pop();
            prev[i]=(stk.isEmpty())?-1:arr[stk.peek()];
            stk.push(i);
        }
        return prev;
    }
}
