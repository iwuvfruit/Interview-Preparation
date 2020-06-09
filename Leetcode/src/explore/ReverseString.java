package explore;

public class ReverseString {
	public static void main(String[] args) {
		
	}
	public static void reverse(char[] words) {
		int aPointer = 0;
		int bPointer = words.length;
		char tmp;
		while(aPointer < bPointer) {
			tmp = words[aPointer];
			words[aPointer] = words[bPointer];
			words[bPointer] = tmp;
		}
		
	}
}
