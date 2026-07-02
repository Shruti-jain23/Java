package LinkedList;
import java.util.Scanner;
public class Sort012 {
    public static Node sort(Node head) {
        if (head == null || head.next == null)
            return head;
        Node zeroDummy = new Node();
        Node oneDummy = new Node();
        Node twoDummy = new Node();
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;
        Node curr = head;
        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
            }
            else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;
        return zeroDummy.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = Util.create(sc);
        System.out.println("Original List:");
        Util.printList(head);
        head = sort(head);
        System.out.println("Sorted List:");
        Util.printList(head);
    }
}
