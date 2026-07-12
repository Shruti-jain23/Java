package Stack;

import java.util.Stack;

public class Sumsubrange {
    public static int range(int[] arr){
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
        long min= 0;
        for (int i = 0; i < n; i++) {
            min = (min + (long) arr[i] * left[i] * right[i]);
        }

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]) s.pop();
            left[i]=s.isEmpty()?i+1:i-s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]) s.pop();
            right[i]=s.isEmpty()?n-i:s.peek()-i;
            s.push(i);

        }
        long max= 0;
        for (int i = 0; i < n; i++) {
            max = (max + (long) arr[i] * left[i] * right[i]);
        }
        return max-min;
    }
}
