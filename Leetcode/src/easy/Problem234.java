package easy;
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
public class Problem234 {
	public static void main(String[] args) {
		
	}
	
	 public boolean isPalindrome(ListNode head) {
	    	if(head == null) {
	    		return true;
	    	}
	    	ListNode fast = head;
	    	ListNode slow = head;
	    	
	    	while(fast.next != null && fast.next.next != null) {
	    		fast = fast.next.next;
	    		slow = slow.next;
	    	}
	    	ListNode secondHalf = reverse(slow.next);
	    	ListNode firstHalf = head;
	    	
	    	while(secondHalf != null && firstHalf !=null) {
	    		if(firstHalf.val != secondHalf.val) {
	    			return false;
	    		}
	    		secondHalf = secondHalf.next;
	    		firstHalf = firstHalf.next;
	    	}
	    	return true;
	    }
	    public static ListNode reverse(ListNode head) {
	    	ListNode newHead = null; 
	    	while(head != null) {
	    		ListNode nextNode = head.next;
	    		head.next = newHead;
	    		newHead = head;
	    		head = nextNode;
	    	}
	    	return newHead;
	    }
}
