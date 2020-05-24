import java.util.Arrays;
import java.util.HashMap;

public class Problem217 {
	public static void main(String[] args) {
		
	}
    public boolean containsDuplicate(int[] nums) {
//    	for(int i = 0; i < nums.length-1; i++) {
//    		for(int j = i+1; i< nums.length; j++) {
//    			if (nums[i] == nums[j]) {
//    				return true;
//    			}
//    		}
//    	}
//    	return false;
    	
    	//using hash map - priotize speed
//    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//    	for(int i = 0; i < nums.length; i++) {
//    		if(map.containsKey(nums[i])) {
//    			return false;
//    		}
//    		map.put(nums[i], i);
//    	}
    	//using sort - priotize memory
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == nums[i+1]) {
    			return true;
    		}
    	}
    	return false;
    }
}
