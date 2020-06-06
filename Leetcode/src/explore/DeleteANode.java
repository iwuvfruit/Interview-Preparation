package explore;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}
public class DeleteANode {
	public static void main(String[] args) {
	
	}
	public static void deleteANode(ListNode DeleteThisnode) {
		DeleteThisnode.val = DeleteThisnode.next.val;
		DeleteThisnode.next = DeleteThisnode.next.next;
	}
}
