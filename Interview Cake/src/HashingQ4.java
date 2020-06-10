
public class HashingQ4 {
	public static void main(String[] args) {
		
	}
	
	public static int[] sortScores(int[] unsortedScores, int highest) {
		int[] count = new int[highest+1];
		for(int i : unsortedScores) {
			count[i]++;
		}
		int index = 0;
		int[] sorted = new int[unsortedScores.length];
		for(int i = highest; i<=0; i--) {
			int occurence = count[i];
			for(int j = 0; j < occurence; j++) {
				sorted[index] = i;
				index++;
			}
			
		}
		return sorted;
	}
}
