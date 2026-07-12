package Stack;
import java.util.*;
public class SumSubarrayMin {
    public static int summin(int[] arr){
        int n=arr.length;
        long mod = 1_000_000_007;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]) s.pop();
            left[i]=s.isEmpty()?i+1:i-s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            right[i]=s.isEmpty()?n-i:s.peek()-i;
            s.push(i);
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans=(ans+(long) arr[i]*left[i]*right[i])%mod;

        }
        return (int)ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of value in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=summin(arr);
        System.out.println(ans);
    }
}
