package LinkedList;
import java.util.Scanner;

public class Util {
    public static Node create(Scanner sc){
        System.out.println("Enter the no of nodes : ");
        int n=sc.nextInt();
        if(n==0) return null;
        System.out.println("Enter node values: ");
        Node head=new Node(sc.nextInt());
        Node tail=head;
        for(int i=1;i<n;i++){
            tail.next=new Node(sc.nextInt());
            tail=tail.next;
        }
        return head;

    }
    public static void printList(Node head){
        while(head!=null) {
            System.out.print(head.val);
            if(head.next!=null){
                System.out.print(" -> ");
            }
            head=head.next;
        }
        System.out.println();


    }
}
