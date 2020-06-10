
public class GreedyAlgoQ1 {
	public static void main(String[] args) {
		
	}
	public static int getMaxProfit(int[] stockPrices) {
		if(stockPrices.length < 2) {
			throw new IllegalArgumentException("getting a profit requires at least two profits");
		}
		int min = stockPrices[0];
		int max = stockPrices[1] - stockPrices[0];
		
		for(int i = 1; i < stockPrices.length; i++) {
			int current = stockPrices[i];
			int potentialProfit = current - min;
			max = Math.max(max, potentialProfit);
			min = Math.min(min, current);
		}
		return max;
	}
}
