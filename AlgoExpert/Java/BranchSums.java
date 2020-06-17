import java.util.ArrayList;
import java.util.List;


//give bst, return the list with branch sums.
//          25
//       19    28
//     13  20 22  30
// [25+19+13, 25+19+20, 25+28+22, 25+28+39] 

//we continously add from the top 
//we use recursion 

//O(n)time, we traverse every node
//O(n) space, the list length is the number of leaves => n/2 -> O(n)
public class BranchSums {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
	public static void main(String[] args) {
		
	}
	public static ArrayList<Integer> branchSum(TreeNode bst) {
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		helper(bst, sum, list);
		return list;	
	}
	public static void helper(TreeNode bst, int sum, ArrayList<Integer> list) {
		if(bst == null) {
			return;
		}
		sum += bst.val;
		if(bst.left == null && bst.right == null) {
			list.add(sum);
		}
		helper(bst.left, sum, list);
		helper(bst.right, sum, list);
		
		
		
		
	
	}

	
}
