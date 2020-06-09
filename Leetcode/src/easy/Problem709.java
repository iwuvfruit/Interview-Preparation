package easy;

public class Problem709 {
	public static void main(String[] args) {
		
	}
	 public String toLowerCase(String str) {
		 //str.toLowerCase(); built in
	        if(str == null) {
	            return null;
	        }
	        String newValue = "";
	        for(int i = 0; i < str.length(); i++) {
	            char x = str.charAt(i); 
	            if(x>=65 && x<=90) {
	                x += 32;
	            }
	            newValue += x;
	        }
	        return newValue;
	    }
	 public String toLowerCaseUsingMethods(String str) {
		 String val ="";
		 for(char x: str.toCharArray()) {
			 if(Character.isUpperCase(x)) {
				 val += (char)(x+32);
			 }
			 else {
				 val += x;
			 }
		 }
		 return val;
	 }
}
