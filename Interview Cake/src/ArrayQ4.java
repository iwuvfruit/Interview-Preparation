
public class ArrayQ4 {
	public static void main(String[] args) {
		
	}
	public static void mergeArrays(int[] myArray, int[] aliceArray) {
		int[] res = new int[myArray.length + aliceArray.length];
		int myPointer = 0; 
		int alicePointer = 0;
		int index = 0;
		while(myPointer != myArray.length && alicePointer != aliceArray.length) {
			if(myArray[myPointer] < aliceArray[alicePointer]) {
				res[index] = myArray[myPointer];
				myPointer++;
				index++;
			}
			else {
				res[index] = aliceArray[alicePointer];
				alicePointer++;
				index++;
			}
				
		}
		while(myPointer != myArray.length) {
			res[index] = myArray[myPointer];
			myPointer++;
			index++;
		}
		while(alicePointer != aliceArray.length ) {
			res[index] = aliceArray[alicePointer];
			alicePointer++;
			index++;
		}
	}
}

//O(n) speed and O(n) space complexity