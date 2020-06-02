package easy;
import java.util.HashMap;

public class Problem1 {
	public static void main(String[] args) {
		
	}
    public int[] twoSum(int[] nums, int target) {
//        int complement = 0;
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                complement = target - nums[i];
//                if(complement == nums[j]) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("no match found");
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int complement = 0;
    	for(int i = 0; i < nums.length; i++) {
    		map.put(nums[i], i);

    		complement = target - nums[i];
    		if(map.containsKey(complement)) {
    			return new int[] {i, map.get(complement)};
    		}
    	}
    	throw new IllegalArgumentException("no match found");
    	
    	
    }
    	
}