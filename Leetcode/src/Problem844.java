import java.util.Stack;

public class Problem844 {
	public static void main(String[] args) {
		
	}
	
	public boolean backspaceCompare(String s, String t) {
		return (build(s).equals(build(t)));
	}
	public String build(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c: s.toCharArray()) {
			if(c != '#') {
				stack.push(c);
			}
			else if(!stack.isEmpty()) {
				stack.pop();
			}
		}
		return stack.toString();
	}
}
