package explore;

public class PlusOne {
	public static void main(String[] args) {
		
	}
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		for(int i = n-1; i >= 0; i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			//added the num that's 9
			digits[i] = 0;
		}
		//increase array
		int[] new_number = new int[digits.length + 1];
		new_number[0] = 1;
		return new_number;
	}
}
