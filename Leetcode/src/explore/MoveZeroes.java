package explore;

import java.util.Arrays;
import java.util.Stack;

public class MoveZeroes {
	public static void main(String[] args) {
        int[] nums = new int[]{1,0,2,0,3,0};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::print); // 123000
    }

    public static void moveZeroes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> zeroStack = new Stack<>();
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                stack.push(nums[i]);
            } else {
                zeroStack.push(nums[i]);
            }
        }
        int index = 0;
        while (!stack.isEmpty()) {
            res[index++] = stack.pop();
        }
        while (!zeroStack.isEmpty()) {
            res[index++] = zeroStack.pop();
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }

    }
    
    public static void moveZeroesInPlace(int[] nums) {
    	int i = 0;
    	for(int j = 0; j < nums.length; j++) {
    		if(nums[j] != 0) {
    			nums[i++] = nums[j];
    		}
     	}
    	for(int x = i; x < nums.length; x++ ) {
    		nums[x] = 0;
    	}
    		
    }
}