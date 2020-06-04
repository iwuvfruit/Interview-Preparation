package explore;

public class BestTimeToBuyAndSellStock2 {
	public static void main(String[] args) {
		int[] x = {1,2,3};
		System.out.println(x.length);
	}
	public static int bestTimeOne(int[] nums){
		int min = Integer.MAX_VALUE;
		int max = 0;
		
		for(int i = 0; i <nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}else if(max < nums[i] - min) {
				max = nums[i] - min;
			}
			if(max < 0) {
				return 0;
			}
		}
		return max;
		
	}
	public static int bestTimeTwo(int[] prices) {
		//plot the graph, the graph will reach the max anyway
		        int maxProfit = 0;
		        for(int i = 0; i < prices.length -1; i++) {
		            if(prices[i] < prices[i+1]) {
		                maxProfit += prices[i+1] - prices[i];
		            }
		        }
		        return maxProfit;
		    }
	}

