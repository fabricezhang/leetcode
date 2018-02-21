package zhang.jun.leetcode;

public class AddTwoNumbers02 {

    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        l1 = new ListNode(5);
        l2 = new ListNode(5);

        ListNode res = addTwoNumbers(l1,l2);
        while(res!=null){
            System.out.print(res.val);
            res = res.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return calc(l1,l2,0);
    }

    public static ListNode calc(ListNode l1, ListNode l2 , int n){

        int v1 = l1==null?0:l1.val;
        int v2 = l2==null?0:l2.val;
        int flag = n;
        ListNode r;
        int res = v1 + v2 + n;

        if (res > 9 ){
            r = new ListNode(res - 10);
            n = 1;
        } else {
            r = new ListNode(res);
            n = 0;
        }

        if (l1 == null && l2 == null && flag == 0){
            return null;
        }

        r.next = calc(l1==null?null:l1.next,l2==null?null:l2.next,n);

        return r;
    }

}
