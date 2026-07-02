package LinkedList;
import java.util.Scanner;

public class Middle {
    public  static Node mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node head=Util.create(sc);
        Middle obj=new Middle();
        Node middle = obj.mid(head);
        System.out.println("Middle node: " + middle.val);


    }


}
