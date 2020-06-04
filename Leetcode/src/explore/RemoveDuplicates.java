package explore;

import java.util.HashMap;


public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] ex = {1,1,2,2,3,4,4};
		System.out.println(removeDuplicates(ex));
		
	}
	public static int removeDuplicates(int[] nums) {
		HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
		for(int i = 0; i <nums.length; i++) {
			if(set.containsKey(nums[i])) {
				continue;
			}else {
				set.put(nums[i], i);
			}
		}
		return set.size();
	}
	public static int removeDuplicatesInPlace(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int slowPointer = 0;
		for(int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
			if(nums[slowPointer] != nums[fastPointer]) {
				slowPointer++;
				nums[slowPointer] = nums[fastPointer];
			}
		}
		return slowPointer+1;
	}
	
}
