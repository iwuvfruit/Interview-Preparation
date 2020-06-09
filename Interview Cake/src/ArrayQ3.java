
public class ArrayQ3 {
	public static void main(String[] args) {
		
	}
	
	public static void reverseWrods(char[] words) {
		//reverse all the letters so the words are in the right order
		//then we will reverse each characters in the words 
		reverse(0, words.length, words);
		
		//we check where the character ends for each words
		int start = 0;
		for(int i =0; i <= words.length; i++) {
			if(i == words.length || words[i] == ' ') {
				reverse(start, i-1, words);
				start = i+1;
			}
			
		}
		
		
	}
	public static void reverse(int start, int end, char[] letters) {
		int aPointer = start;
		int bPointer = end;
		while(aPointer < bPointer) {
			char tmp = letters[aPointer];
			letters[aPointer] = letters[bPointer];
			letters[bPointer] = tmp;
			
			aPointer++;
			bPointer--;
		}
	}
}
