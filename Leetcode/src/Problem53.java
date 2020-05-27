//
//public class Problem53 {
//	public static void main(String[] args) {
//		
//	}
//    public int maxSubArray(int[] nums) {
//    	int max = Integer.MIN_VALUE;
//    	for(int i = 0; i < nums.length; i++) {
//    		for(int j = i; j < nums.length; j++) {
//    			int sum = 0;
//    			for(int k = i; k < j; k++) {
//    				sum += nums[k];
//    			}
//    			if(sum > max) {
//    				max = sum;
//    			}
//    		}
//    	}
//    	return max;
//    	
//    }
//}
