class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int val) { 
    this.val = val; 
  }
}

class FindClosestValInBST {
  public static void main(String[] args) {
    TreeNode node = new TreeNode(9);
    node.left = new TreeNode(4);
    node.right = new TreeNode(17);

    node.left.left = new TreeNode(3);
    node.left.right = new TreeNode(6);
    node.left.right.left = new TreeNode(5);
    node.left.right.right = new TreeNode(7);

    node.right.right = new TreeNode(22);
    node.right.right.left = new TreeNode(20);

    int closestNode = findClosestNode(node, 18);
    System.out.println(closestNode);
    
    //5            7
   //2  6
  }
  
  public static int findClosestNode(TreeNode node, int target) {
	  int closest = Integer.MAX_VALUE;
	  int x=  helper(node, target, closest);
	  int y= helperIterative(node, target, closest);
	  System.out.println(x + " and " + y);
	  return 0;
  }
  //on avg O(log n)T and O(log n)S because using its recursive stack 
  //on the worst O(n) if branch is only at one side 
  public static int helper(TreeNode node, int target, int closest) {
	  if(node == null) {
		  return closest;
	  }
	  if(Math.abs(closest - target) > Math.abs(node.val - target)) {
		  closest = node.val;
		  }
	  if(target < node.val) {
		  return helper(node.left, target, closest);
	  }
	  else if(target > node.val) {
		  return helper(node.right, target, closest);
	  }else {
		  return closest;
	  }
	  }
  
  public static int helperIterative(TreeNode node, int target, int closest) {
	 
	  while(node != null) {
		 if(Math.abs(target - closest) > Math.abs(node.val - target) ) {
			 closest = node.val;
		 }
		 if(target < node.val) {
			 node = node.left;
		 }else if(target > node.val) {
			 node = node.right;
		 }else {
			 return node.val;
		 }
	  }
	  return closest;
  }
}