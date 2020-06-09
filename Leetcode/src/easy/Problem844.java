package easy;
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
	
	public boolean backspaceCompareWithSpaceOone(String s, String t) {
			int sPointer = s.length()-1;
			int tPointer = t.length()-1;
			int sSkip = 0;
			int tSkip = 0;
			
			while(sPointer > 0 || tPointer > 0) {
				while(sPointer > 0) {
					if(s.charAt(sPointer) == '#') {
						sSkip++;
						sPointer--;
					}else if(sSkip>0) {
						sSkip--;
						sPointer--;
					}
					else {
						break;
					}
				}
				while(tPointer > 0) {
					if(t.charAt(tPointer) == '#') {
						tSkip++;
						tPointer--;
					}else if(tSkip>0) {
						tSkip--;
						tPointer--;
					}else {
						break;
					}
				}
				
				if(sPointer >= 0 && tPointer >=0 && s.charAt(sPointer) != t.charAt(tPointer) ) {
					return false;
				}
				if((sPointer>=0) != (tPointer>=0)){
					return false;
				}
				sPointer --;
				tPointer --;
			}
			
			return true;

			}
	}
