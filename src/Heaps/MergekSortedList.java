package Heaps;

import java.util.PriorityQueue;

/*public class MergekSortedList {
    public static void merge(ListNode[] lists){
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode temp:lists){
            if(temp!=null)pq.offer(temp);
        }
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(!pq.isEmpty()){
            ListNode curr=pq.poll();
            tail.next=curr;
            tail=tail.next;
            if(curr.next!=null) pq.offer(curr.next);
        }
        return dummy.next;
    }
}*/
