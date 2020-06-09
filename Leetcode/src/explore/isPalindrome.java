package explore;

public class isPalindrome {
	public static void main(String[] args) {
		
	}
	public boolean isPalidrome(String s){
		String res ="";
		for(Character c: s.toCharArray()) {
			if(Character.isDigit(c) || Character.isLetter(c)) {
				res += c;
			}
		}
		int pointerA = 0;
		int PointerB = res.length()-1;
		
		while(pointerA < PointerB) {
			if(res.charAt(pointerA) != res.charAt(PointerB)) {
				return false;
			}
			pointerA++;
			PointerB--;
			
		}
		return true;
	}
}
