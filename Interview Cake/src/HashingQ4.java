import java.util.Arrays;

public class HashingQ4 {
	public static void main(String[] args) {
		int[] unsortedScores = {37, 89, 41, 65, 91, 53};
		final int HIGHEST_POSSIBLE_SCORE = 100;
		int[] x = sortScores(unsortedScores,HIGHEST_POSSIBLE_SCORE);
		System.out.println(Arrays.toString(x));
	}
			
	public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {
		
		int[] scoreCounts = new int[highestPossibleScore+1];
		for(int score: unorderedScores) {
			scoreCounts[score]++;
		}
		
		int[] sortedScores = new int[unorderedScores.length];
		int currentSortedIndex = 0;
		for(int score = highestPossibleScore; score >= 0; score--) {
			int count = scoreCounts[score];
			
			for(int occurence = 0; occurence <count; occurence++) {
				sortedScores[currentSortedIndex] = score;
				currentSortedIndex++;
			}
		}
		return sortedScores;
		
	}

}
