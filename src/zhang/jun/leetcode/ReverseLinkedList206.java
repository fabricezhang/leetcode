package zhang.jun.leetcode;

public class ReverseLinkedList206 {

	private static ListNode previousNode;
	private static ListNode newHead;
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
    public static ListNode reverseList(ListNode head) {
    	if(head==null){
    		return null;
    	}
    	getPrevNode(head);
    	return newHead;
    }
	public static ListNode getPrevNode(ListNode node) {		
		if(node.next!=null){
			previousNode = getPrevNode(node.next);
			node.next=null;
			previousNode.next = node;			
			return node;
		}else{
			newHead = node;
			return node;			
		}   
		
	}		

}
