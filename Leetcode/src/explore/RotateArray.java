package explore;

public class RotateArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int[] b = rotateWithSpace(a, 3);
		for(int i =0; i < b.length; i++ ) {
			System.out.println(b[i]);
		}
	}
	public void bruteForce(int[] nums, int k) {
		int last, tmp;
	
		for(int i = 0; i < k; i++) {
			last = nums[nums.length-1];
			for(int j=0; j < nums.length; j++) {
				tmp = nums[j];
				nums[j] = last;
				last = tmp;
		}
	}
	}
	public void rotateWithSpace(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            temp[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
	public void rotateWithConstantSpeed(int[] nums, int k) {
		int len = nums.length;
		k %= len;
		
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
	}
	
	public int[] reverse(int[] nums,int start, int end) {
		while(start <= end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			
			start++;
			end--;
		}
		return nums;
	}
}
