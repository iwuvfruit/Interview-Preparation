import java.util.HashMap;
import java.util.Map;

public class HashingQ3 {
	public static class WordCloudData {
		HashMap<String, Integer> wordsToCounts = new HashMap<>();
		public WordCloudData(String inputString) {
			populateWordsToCounts(inputString);
		}
		public Map<String, Integer> getWordsToCounts() {
			return wordsToCounts;
		}
		private void populateWordsToCounts(String inputString) {
			//iterate over each character in the input string
			//split words and pass them to addWordToHashMap()
			
			int currentWordStartIndex = 0; 
			int currentWordLength = 0;
			for(int i = 0; i < inputString.length(); i++) {
				char character = inputString.charAt(i);
				
				if(i == inputString.length() -1) {
					if(Character.isLetter(character)) {
						currentWordLength++;
					}
					if(currentWordLength >0) {
						String currentWord = inputString.substring(currentWordStartIndex, 
								currentWordStartIndex + currentWordLength);
						addWordToHashMap(currentWord);
								
					}
					
				}
				else if(character == ' ' || character =='\u2014') {
					if(currentWordLength > 0) {
						String currentWord = inputString.substring(currentWordStartIndex,
								currentWordStartIndex + currentWordLength);
						addWordToHashMap(currentWord);
						currentWordLength = 0;
					}
				}
				else if(character == '.') {
					if(i < inputString.length() - 1 && inputString.charAt(i + 1) == '.') {
						if(currentWordLength > 0) {
							String currentWord = inputString.substring(currentWordStartIndex,
									currentWordStartIndex + currentWordLength);
						addWordToHashMap(currentWord);
						currentWordLength = 0;

						}
					}
				}
				else if(Character.isLetter(character) || character == '\'') {
					if(currentWordLength == 0) {
						currentWordStartIndex = i;
					}
					currentWordLength++;
				}
				else if(character == '-') {
					if(i > 0 && Character.isLetter(inputString.charAt(i-1)) &&
							Character.isLetter(inputString.charAt(i+1))) {
						if(currentWordLength == 0) {
							 currentWordStartIndex = i;
						}
						currentWordLength++;
					}
						else {
							if(currentWordLength > 0) {
								String currentWord = inputString.substring(currentWordStartIndex, 
										currentWordStartIndex + currentWordLength);
								addWordToHashMap(currentWord);
								currentWordLength = 0;
							}
						}
					}
				}
				
			}
		private void addWordToHashMap(String word) {
			if(wordsToCounts.containsKey(word)) {
				wordsToCounts.put(word, wordsToCounts.get(word) + 1); 
			} else if(wordsToCounts.containsKey(word.toLowerCase())) {
				int newCount = wordsToCounts.get(word.toLowerCase() + 1);
				wordsToCounts.put(word.toLowerCase(), newCount);
			} else if (wordsToCounts.containsKey(capitalize(word))) {
	            int newCount = wordsToCounts.get(capitalize(word)) + 1;
	            wordsToCounts.put(word, newCount);
	            wordsToCounts.remove(capitalize(word));}
				else {
		            wordsToCounts.put(word, 1);
		        }

		}
		
		private String capitalize(String word) {
	        return word.substring(0, 1).toUpperCase() + word.substring(1);
	    }
	}
}
