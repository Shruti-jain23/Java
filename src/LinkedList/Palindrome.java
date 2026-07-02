package LinkedList;

import java.util.Scanner;

public class Palindrome {
    public static boolean check(Node head){
        Node mid=Middle.mid(head);
        Node reversed=Reverse.rev(mid);
        while(reversed!=null){
            if(head.val!=reversed.val) return false;
            head=head.next;
            reversed=reversed.next;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Node head=Util.create(sc);
        boolean ans=Palindrome.check(head);
        if(ans) System.out.println("YES ! Palindrome");
        else System.out.println("No ! not a palindrome ");

    }

}
