package easy;
import java.util.Arrays;

public class Problem977 {
	public static void main(String[] args) {
		
	}
	public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }
        Arrays.sort(B);
        return B;
    }
	
	public int[] optimalSortedSquares(int[] A) {
		int positivePointer  = 0;
        while(positivePointer < A.length && A[positivePointer] < 0) {
            positivePointer++;
        }
        int negativePointer = positivePointer - 1;
        int[] sorted = new int[A.length];
        int counter = 0;
        while(negativePointer >= 0 && positivePointer < A.length) {
            if(A[negativePointer] * A[negativePointer] < A[positivePointer] * A[positivePointer]) {
                sorted[counter] = A[negativePointer]* A[negativePointer];
                counter++;
                negativePointer--;
            }
            else{
                sorted[counter] = A[positivePointer] *A[positivePointer];
                counter++;
                positivePointer++;
            }
        }
        while(negativePointer >=0) {
            sorted[counter] = A[negativePointer] * A[negativePointer];
            counter++;
            negativePointer--;
        }
        while(positivePointer < A.length){
                sorted[counter] = A[positivePointer] *A[positivePointer];
                counter++;
                positivePointer++;
        }
        return sorted;
    }
}
