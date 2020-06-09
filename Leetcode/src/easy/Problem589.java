package easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem589 {
	List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
	
}
	public List<Integer> preorderWithRecursion(Node root) {
		if(root == null) {
			return list;
		}
		list.add(root.val);
		for(Node node: root.children) {
			
			preorderWithRecursion(node);
		}
		return list;
	}
	
    public List<Integer> preorder(Node root) {
    	LinkedList<Integer> list = new  LinkedList<Integer>();
    	Stack<Node> stack = new Stack<>();
    	
    	if(root == null) {
    		return list;
    	}
    	stack.add(root);
    	while(!stack.isEmpty()) {
    		root = stack.pop();
    		list.add(root.val);
    		Collections.reverse(root.children);
    		for(Node node: root.children) {
    			stack.push(node);
    		}
    	}
    	return list;
    }
}
