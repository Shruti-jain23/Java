package LinkedList;

import java.util.Scanner;

public class Loop {
    public boolean  detect(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public Node start(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                Node start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;

    }
    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;
        Loop obj = new Loop();
        System.out.println(obj.detect(n1));
        Node start = obj.start(n1);
        System.out.println("Cycle starts at: " + start.val);
    }
}
