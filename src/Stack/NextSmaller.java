package Stack;

import java.util.Stack;

public class NextSmaller {
    public static int[] nexts(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int n=arr.length;
        int[] right=new int[n];
        for(int i=n-1;i>0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            right[i]=(stk.isEmpty())? -1:arr[stk.peek()];
            stk.push(i);
        }


        return right;
    }
}
