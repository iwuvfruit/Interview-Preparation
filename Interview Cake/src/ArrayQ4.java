
public class ArrayQ4 {
	public static void main(String[] args) {
		
	}
	public static int[] mergeArrays(int[] myArray, int[] aliceArray) {
		int[] merged = new int[myArray.length + aliceArray.length];
		int alicePointer = 0;
		int myPointer = 0;
		int index = 0;
		
		while(index < merged.length) {
			boolean isMyArrayFinished = myPointer >= myArray.length;
			boolean isAliceFinished = alicePointer >= aliceArray.length;
			
			if(!isMyArrayFinished && (
					isAliceFinished|| myArray[myPointer] < aliceArray[alicePointer]
					)) {
				merged[index] = myArray[myPointer];
				myPointer++;
			}else {
				merged[index] = aliceArray[alicePointer];
				alicePointer++;
			}
			index++;
		
		}
		return merged;
	}
}

//O(n) speed and O(n) space complexity