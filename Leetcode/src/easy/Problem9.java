package easy;

public class Problem9 {
	public static void main(String[] args) {
		
	}
	
    public boolean isPalindrome(int x) {

    	if(x < 0) {
    		return false;
    	}    	
    	String val = String.valueOf(x);
    	if(val.length() %2 == 1) {
    		return false;
    	}
    	
    	int lastIndex = val.length()-1;
    	int index = 0;
    	while(index < lastIndex) {
    		if(val.charAt(index) != val.charAt(lastIndex)) {
    			return false;
    		}
    		index++;
    		lastIndex--;
    	}
    	
    	return true;
    }
    public boolean isPalindromeWithoutString(int x) {
    	if(x == 0) {
    		return true;
    	}
    	if(x < 0 || x % 10 == 0) {
    		return false;
    	}
    	int reversed = 0;
    	int original = x;
    	while(original > reversed) {
    		int pop = original % 10;
    		original /= 10;
    		reversed = (reversed * 10) + pop;
    	}
    	if(original == reversed || original == reversed / 10) {
    		return true;
    	}
    	return false;
    }
 }


