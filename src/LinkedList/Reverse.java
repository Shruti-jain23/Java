package LinkedList;

import java.util.Scanner;

public class Reverse {
    public  static Node rev(Node head){
        if(head==null ||head.next==null) return head;
        Node prev=null;
        Node pres=head;
        Node next=head.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null) next=next.next;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node head=Util.create(sc);
        System.out.println("Original LinkedList : ");
        Util.printList(head);
        Reverse obj=new Reverse();
        head= obj.rev(head);
        System.out.println("Reversed LinkedList : ");
        Util.printList(head);



    }
}
