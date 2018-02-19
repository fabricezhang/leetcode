package zhang.jun.leetcode;

public class RemoveDuplicatesFromSortedList083 {
	
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head==null){
    		return head;
    	}
    	ListNode iteratorA = head;
    	ListNode iteratorB = iteratorA;
    	while(iteratorB.next!=null){
    		if(iteratorB.next.val!=iteratorA.val){
    			iteratorA.next = iteratorB.next;
    			iteratorA = iteratorA.next;    			
    		} else{
    			iteratorB = iteratorB.next;
    		}
    	}
    	iteratorA.next=null;
    	return head;    
    }

    public static ListNode deleteDuplicates_2(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode newList = new ListNode(head.val);
        ListNode iterator = newList;
        while(head !=null){
            if(head.val!=iterator.val){
                iterator.next = new ListNode(head.val);
                iterator = iterator.next;
            }
            head = head.next;
        }
        return newList;
    }
}
