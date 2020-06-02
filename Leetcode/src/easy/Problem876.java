package easy;


public class Problem876 {
public static void main(String[] args) {
	ListNode x = new ListNode(1);
	
	
	ListNode y = new ListNode(2,x);
	ListNode a = new ListNode(3, y);
	ListNode b = new ListNode(4, a);
	ListNode c = new ListNode(5, b);
	ListNode d = new ListNode(6, c);
	
	ListNode r= middleNode(d);
	System.out.println(r.val);

	ListNode aa= withTwoPointers(d);
	System.out.println(aa.val);


}
	public static ListNode middleNode(ListNode head) {
    ListNode[] A = new ListNode[100];
    int t = 0;
    while (head.next != null) {
        A[t++] = head;
        head = head.next;
    }
    return A[5 / 2];
    
	}
	
	public static ListNode withTwoPointers(ListNode head) {
		if(head ==null) {
			return null;
		}
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		
		while(fastPointer.next != null && fastPointer.next.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		return slowPointer;
		
	}
}

