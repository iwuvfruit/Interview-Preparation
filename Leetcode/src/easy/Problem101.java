package easy;

public class Problem101 {
	public static void main(String[] args) {
	
	}
	public boolean isSymmetric(TreeNode node) {
		if(node == null) {
			return true;
		}
		return isMirror(node.left, node.right);
	}
	public boolean isMirror(TreeNode node1, TreeNode node2) {
		if(node1 == null && node2 == null) {
			return true;
		}
		if(node1 == null || node2 == null) {
			return false;
		}
		if(node1.val != node2.val) {
			return false;
		}
		return (node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
		
	}
	
}
