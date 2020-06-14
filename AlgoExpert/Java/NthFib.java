import java.util.HashMap;

//problem: wrtie a function that takes an input n and output a fibnonacci 
//the result is the addition of the last two. 
//so for instance, 0-> 1 -> 1 -> 2(1+1) -> 3 (1+2) -> 5(2+3) 
public class NthFib {
	public static void main(String[] args) {
	
	}
	//O(2^n) time O(n) space
	public static int nthFib(int n) {
		if(n <= 0) {
			throw new IllegalArgumentException("invalid input");
		}
		else if(n == 1) {
			return 0;
		}
		else if(n == 2) {
			return 1;
		}
		else {
			return nthFib(n-1) + nthFib(n-2);
		}	
	}
	//O(n) time, O(n) space
	public static int nthFibWithMemoization(int n) {
		int[] array = new int[n];
		if(n < 2) {
			return 0;
		}
		if(n ==2 ) {
			return 1;
		}
		int counter = 3;
		while(counter <= n) {
			array[counter] = array[counter-1] + array[counter-2];
			counter++;
		}
		return array[n-1];
 	}
	//O(n) time, O(1) space
	public static int nthFibWithMemoizationIterative(int n) {
		if(n < 2) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		int current = 0;
		int last = 1;
		int secondLast = 0;
		int counter = 2;
		while(counter < n) {
			current = last + secondLast;
			secondLast = last;
			last = current;
			counter += 1;
					
		}
		return current;
		
	}
	
}
