package easy;
import java.util.HashMap;

public class Problem167 {
	public static void main(String[] args) {
		
	}
	public int[] twoSum(int[] numbers, int target) {
    	int a_point = 0;
    	int b_point = numbers.length-1; 
    	
    	for(int i = 0; i < numbers.length; i++) {
    		int sum = numbers[a_point] +  numbers[b_point];
    		if(sum < target) {
    			a_point++;
    		}
    		else if(sum > target) {
    			b_point--;
    		}
    		else if(sum == target){
    			return new int[] {a_point+1, b_point+1};
    			
    		}
    	}
    	return new int[] {};
    }
}
