import java.util.ArrayList;

public class DepthFirstSearch {
	static class TreeNode{
		String name;
		ArrayList<TreeNode> list = new ArrayList<>();
		
		public TreeNode(String name) {
			this.name = name;
		}
		public TreeNode addChild(String name) {
			TreeNode child = new TreeNode(name);
			list.add(child);
			return this;
		}
	
	
	public static void main(String[] args) {
		
	}
	//given node 
	//return array containing nodes founding using depth first search approach 
	//we put the node in the list and call dfs on the child 
	
	//O(V+E) speed: we traverse each vertices and edges 
	//O(V) space: 
	public ArrayList<String> dfsUsingRecursion(ArrayList<String> emptyList) {
		emptyList.add(this.name);
		for(TreeNode node: list) {
			node.dfsUsingRecursion(emptyList);
		}
		
		return emptyList;	
	}
	
	//using stack 
	public ArrayList<String> dfsUsingStack(ArrayList<String> emptyList) {
		
		return null;
		}
	
	}
}
