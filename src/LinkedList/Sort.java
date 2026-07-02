package LinkedList;
import java.util.Scanner;

public class Sort {
    public static Node sorting(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        Node left = sorting(head);
        Node right = sorting(slow);
        return merge(left, right);
    }
    public static Node merge(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = Util.create(sc);
        System.out.println("Original List:");
        Util.printList(head);
        head = sorting(head);
        System.out.println("Sorted List:");
        Util.printList(head);
    }
}