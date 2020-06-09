
public class ArrayQ5 {
	public static void main(String[] args) {
		
	}
    public static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
    	int takeOutOrdersPointer = 0;
    	int dineInOrdersPointer = 0; 
    	for(int order: servedOrders) {
    		if(takeOutOrdersPointer < takeOutOrders.length && order == takeOutOrders[takeOutOrdersPointer] ) {
    			takeOutOrdersPointer++;
    		}
    		else if(dineInOrdersPointer < dineInOrders.length && order == dineInOrders[dineInOrdersPointer]) {
    			dineInOrdersPointer++;
    		}
    		else {
    			return false;
    		}
    	}
    	if(takeOutOrdersPointer != takeOutOrders.length || dineInOrdersPointer != dineInOrders.length  ) {
    		return false;
    	}
    	return true;
	}
}
