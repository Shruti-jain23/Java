package Stack;
import java.util.*;

public class NextGreater {
    public static int[] nextg(int[] arr){
        int n=arr.length;
        Stack<Integer> stk=new Stack<>();
        int[] right=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]<=arr[i]) stk.pop();
            right[i]=(stk.isEmpty())?-1:arr[stk.peek()];
            stk.push(i);
        }
        return right;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = nextg(arr);
        System.out.println("Next Greater Array:");
        System.out.println(Arrays.toString(ans));
    }


}
