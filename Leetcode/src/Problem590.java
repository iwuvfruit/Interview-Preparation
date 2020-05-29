import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Node{
	public int val;
	public List<Node> children;
	
	Node(){
		
	}
	Node(int val){
		this.val = val;
	}
	Node(int val, List<Node> children) {
		this.val = val;
		this.children = children;
	}
	
}
public class Problem590 {
	public static void main(String[] args) {
		
	}
	
	 public List<Integer> postorder(Node root) {
	        List<Integer> list = new ArrayList<Integer>();
	        if(root == null){
	            return list;
	        }
	        Stack<Node> stack = new Stack<Node>();
	        stack.add(root);
	        while(!stack.empty()){
	            root = stack.pop();
	            list.add(root.val); 
	            for(Node node:root.children) {
	                stack.add(node);
	            }
	            
	        }
	        Collections.reverse(list);
	        return list;
	    }
}
