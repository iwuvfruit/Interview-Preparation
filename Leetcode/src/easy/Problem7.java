package easy;

public class Problem7 {
	public static void main(String[] args) {
		
	}
	public int reverse(int x) {
		boolean negative = false;
		if(x < 0) {
			negative = true;
			x *= -1;
		}
		long reverse = 0;
		while(x > 0) {
			int pop = x % 10;
			x /= 10;
			
			reverse = (reverse * 10) + pop;
		}
		if(reverse > Integer.MAX_VALUE) {
			return 0;
		}
		return (int) (negative ? (int)(-1)*reverse : (int)reverse);
		
	}
}
