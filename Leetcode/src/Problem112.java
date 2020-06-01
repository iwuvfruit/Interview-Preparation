import java.util.Stack;

public class Problem112 {
	public static void main(String[] args) {
		
	}
	public boolean hasPath(TreeNode root, int sum) {
		if(root == null) {
			return false;
		}
		else if(root.left == null && root.right == null && sum == 0) {
			return true;
		}
		else {
			return (hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val));
		}
	}
	public boolean hasPathIterative(TreeNode root, int sum) {
		if(root == null ) {
			return false;
		}
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> sumStack = new Stack<>();
		stack.add(root);
		sumStack.add(sum - root.val);
		
		while(!stack.isEmpty()) {
			TreeNode current = stack.pop();
			int currentSum = sumStack.pop();
			if(current.left == null && current.right == null && currentSum == 0) {
				return true;
			}
			if(current.left != null) {
				stack.push(current.left);
				sumStack.push(currentSum - current.left.val);
			}
			if(current.right != null) {
				stack.push(current.right);
				sumStack.push(currentSum - current.right.val );
			}
					
		}
		return false;
	}
}
