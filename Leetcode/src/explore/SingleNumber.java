package explore;

import java.util.HashSet;

public class SingleNumber {
	public static void main(String[] args) {
		
	}
	public int singleNum(int[] numb) {
		HashSet<Integer> set = new HashSet<>();
		for(int num: numb) {
			if(set.contains(num)) {
				set.remove(num);
			}else {
				set.add(num);
			}
		
		}
		for(int i: set) {
			return  i;
		}
		return -1;
	}
	public int singleNumbUsingXor(int[] numb) {
		//we know a xor a is 0, so it cancels out.
		//a xor 0 = 0
		int a = 0;
		for(int num: numb) {
			a ^= num;
		}
		return a;
	}
}
