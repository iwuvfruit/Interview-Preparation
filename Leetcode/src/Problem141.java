import java.util.HashSet;
import java.util.Set;

public class Problem141 {
	public static void main(String[] args) {
	
}
	public boolean hasCycle(ListNode head) {
        Set<ListNode> table = new HashSet<>();
        while(head!=null){
            if(table.contains(head)){
                return  true;
            }
            else{
                table.add(head);
            }
            head = head.next;
        }
        return false;
    }
	public boolean hasCycleWithTwoPointers(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != slow) {
            if(fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
            
    }

}
