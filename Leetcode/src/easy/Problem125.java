package easy;

public class Problem125 {
	public static void main(String[] args) {
		
	}
	public boolean isPalindrome(String s) {
		String result = "";
		for(char c: s.toCharArray()) {
			if(Character.isLetter(c) || Character.isDigit(c)) {
				result += c;
			}
		}
		result = result.toLowerCase();
		int pointerA = 0;
		int pointerB = s.length() - 1;
		
		while(pointerA <= pointerB) {
			if(result.charAt(pointerA) != result.charAt(pointerB)) {
				return false;
			}
			pointerA++;
			pointerB--;
		}
		
		return true;
	}

}
