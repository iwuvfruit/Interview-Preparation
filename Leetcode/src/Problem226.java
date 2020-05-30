public class Problem226 {
	public static void main(String[] args) {
	
	}
    public TreeNode invertTree(TreeNode root) {
    	if(root == null) {
    		return root;
    	}
    	TreeNode left = invertTree(root.left);
    	TreeNode right = invertTree(root.right);
    	
    	TreeNode tmp = right;
    	root.right = left;
    	root.left = tmp;
    	
    	return root;
    }
	
}
