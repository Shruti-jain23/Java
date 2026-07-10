package Heaps;
import java.util.Scanner;

import java.util.PriorityQueue;

public class kthLargest {
    public static int find(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:arr){
            pq.offer(num);
            if(pq.size()>k) pq.poll();

        }
        return pq.peek();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println("Enter no.of values in array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=find(arr,k);
        System.out.println(k + " Largest number is : "+ ans);

    }
}
