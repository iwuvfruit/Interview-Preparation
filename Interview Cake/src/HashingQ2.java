import java.util.HashSet;
import java.util.Set;

public class HashingQ2 {
	public static void main(String[] args) {
		
	}
    public static boolean hasPalindromePermutation(String theString) {
    	//palindrome -> there are two same chars
    	//push char to sets but if duplicate then remove
    	//see if the set contains more than one elem
    	
    	Set<Character> unPaired = new HashSet<>();
    	for(char c: theString.toCharArray()) {
    		if(unPaired.contains(c)) {
    			unPaired.remove(c);
    		}
    		else {
    			unPaired.add(c);
    		}
    	}
    	return unPaired.size() <= 1;

    }
}
