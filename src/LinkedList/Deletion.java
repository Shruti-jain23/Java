package LinkedList;
import java.util.Scanner;

public class Deletion {
    public static void midremove(Node head){
        Node slow=head;
        Node fast=head;
        int l=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            l++;
        }
        Node temp=head;
        for(int i=0;i<l-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public static Node nthremove(int n,Node head){
        int l=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        if (n == l)
            return head.next;
        int k=l-n-1;

        Node temp1=head;
        for(int i=0;i<k;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;

    }
    public static void removeval(int n, Node head){
        Node temp=head;
        while(temp!=null){
            if(temp.val==n){
                temp.val=temp.next.val;
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = Util.create(sc);
        System.out.println("Original List:");
        Util.printList(head);
        System.out.println("\nChoose operation:");
        System.out.println("1. Delete Middle");
        System.out.println("2. Delete Nth Node From End");
        System.out.println("3. Delete by Value");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                midremove(head);
                break;
            case 2:
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                nthremove(n, head);
                break;
            case 3:
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                removeval(val, head);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("\nUpdated List:");
        Util.printList(head);
    }
}
