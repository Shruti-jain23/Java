package LinkedList;

public class Add {
    public static Node addition(Node list1, Node list2){
        Node res=new Node();
        Node curr=res;
        int carry=0;
        while(list1!=null || list2!=null ||carry!=0){
            int sum=carry;
            if(list1!=null){
                sum+=list1.val;
                list1=list1.next;
            }
            if(list2!=null){
                sum+=list2.val;
                list2=list2.next;

            }
            carry=sum/10;
            curr.next=new Node(sum%10);
            curr=curr.next;


        }
        return res.next;
    }
}
