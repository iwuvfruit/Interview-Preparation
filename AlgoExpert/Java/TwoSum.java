import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
	public static void main(String[] args) {
		int[] array = new int[] {32,12,43,213,43,21,2,-12 };
		int[] soln = twoSums3(array, 14);
		for(int i : soln) {
			System.out.println(i);
		}
		
	}
	//brute force
	//O(n^2)T O(n)S
	public static int[] twoSum(int[] sums, int target) {
		for(int i = 0; i < sums.length-1; i++) {
			int current = sums[i];
			int complement = target - current;
			
			for(int j = i+1; j < sums.length; j++) {
				int num = sums[j];
				if (complement == num) {
					if(current < num) {
						return new int[] {current, num};
					}
					else {
						return new int[] {num, current};
					}
				}
			}
		}
		return new int[] {};
	}
	
	//using hashset
	public static int[] twoSum2(int[] sum, int target) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < sum.length; i++) {
			int complement = target - sum[i];
			if(set.contains(complement)) {
				if(complement > sum[i]) {
					return new int[] {sum[i], complement};
 				}
				else {
					return new int[] {complement, sum[i]};
 				}
			}
			else {
				set.add(sum[i]);
			}
		}
		return new int[] {};
	}
	
	//using sort 
	//O(nlogn)T O(1)S
	public static int[] twoSums3(int[] array, int target) {
		Arrays.sort(array);
		int pointerA = 0;
		int pointerB = array.length-1;
		
		while(pointerA < pointerB) {
			int sum = array[pointerA] + array[pointerB];
			if(sum == target) {
				return new int[] {array[pointerA], array[pointerB]};
			}
			else if(sum < target) {
				pointerA++;
			}
			else {
				pointerB--;
			}
		}
		return new int[] {};
	}
}
