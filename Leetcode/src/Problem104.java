
public class Problem104 {
	public static void main(String[] args) {
		
	}
	public int maxDepthDownTop(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int leftNode = maxDepthDownTop(root.left);
		int rightNode = maxDepthDownTop(root.right);
		
		return Math.max(leftNode, rightNode) + 1;
	}
}
