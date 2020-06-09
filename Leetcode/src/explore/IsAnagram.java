package explore;

import java.util.Arrays;



public class IsAnagram {
	public static void main(String[] args) {
		
	} 
	
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()){
			return false;
		}
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		
		return Arrays.equals(sArray, tArray);
	}
	public boolean isAnagram2(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		int[] counter = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;
		}
		for(int i: counter) {
			if(counter[i] != 0) {
				return false;
			}
		}
		return true;
		
		
	}
	

}
