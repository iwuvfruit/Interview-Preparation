package easy;

public class Problem21 {
	public static void main(String[] args) {
		I dont know this one  
	}
	public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
		ListNode temp = new ListNode(-1);
		ListNode current = temp;
		
		while(node1.next != null && node2.next !=null) {
			if(node1.val > node2.val) {
				current.next = node1;
				node1 = node1.next;
			}else {
				current.next = node2;
				node2 = node2.next;
			}
		}
		if(node1.next != null) {
			current.next = node1;
			node1 = node1.next;
		}
		if(node2.next != null) {
			current.next = node2;
			node2 = node2.next;
		}
		return temp.next;
	}
}
