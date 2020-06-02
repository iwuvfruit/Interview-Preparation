package easy;

public class Problem278 {
	public static void main(String[] args) {
		
	}
	public boolean isBadVersion(int n) {
		return true;
	}
	public int firstBadVersion(int n) {
//		for(int i = 0; i < n; i++) {
//			if(isBadVersion(i)) {
//				return i;
//			}
//		}
//		return -1;
		//because it's sorted we can use binary search 
		        int left = 1;
		        int right = n;
		        int mid; 
		        while(left < right) {
		            mid = left + (right - left)/2;
		            if(!isBadVersion(mid)) {
		                left = mid + 1;
		            }
		            else{
		                right = mid;
		            }
		                
		        }
		        if(left == right && isBadVersion(left)) {
		            return left;
		        }
		        return -1;
		    }
}
