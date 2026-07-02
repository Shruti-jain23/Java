package LinkedList;
import java.util.Scanner;

public class OddEven {
    public static Node arrange(Node head){
        if (head == null || head.next == null)
            return head;
        Node odd=head;
        Node even=head.next;
        Node evenhead=even;
        while(odd.next!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Node head=Util.create(sc);
        System.out.println("Original LL : ");
        Util.printList(head);
        head=OddEven.arrange(head);
        System.out.println("Arranged LL : ");
        Util.printList(head);

    }
}
