package easy;

public class Problem657 {
	public static void main(String[] args) {
		
	}
	public boolean judgeCircle(String move) {
		int x = 0;
		int y = 0;
		
		for(char c: move.toCharArray()) {
			if(c == 'U') {
				y += 1;
			}else if(c == 'D') {
				y -= 1;
			}else if(c == 'L') {
				x -= 1;
			}else if(c == 'R') {
				x += 1;
			}
			else {
				throw new IllegalArgumentException("illegal char");
			}
			
		}
		if((x == 0) &&(y==0)) {
			return true;
		}
		return false;
	}
}
