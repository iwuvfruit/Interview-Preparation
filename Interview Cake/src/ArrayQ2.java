
public class ArrayQ2 {
	public static void main(String[] args) {
		
	}
	 public static void reverse(char[] arrayOfChars) {

	        // reverse input array of characters in place
	        int left = 0;
	        int right = arrayOfChars.length -1;
	        while(left < right) {
	            char tmp = arrayOfChars[left];
	            arrayOfChars[left] = arrayOfChars[right];
	            arrayOfChars[right] = tmp;
	            left++;
	            right--;
	        }
}
}
//complexity O(n) time and O(1) space
