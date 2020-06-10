

public class SortingQ1 {

    public static int findRotationPoint(String[] words) {

        // find the rotation point in the array
        final String firstWord = words[0];
        int floorIndex = 0;
        int ceilingIndex = words.length -1;
        while(floorIndex  < ceilingIndex) {
            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);
            //if guess comes after first word 
            if(words[guessIndex].compareTo(firstWord) >= 0) {
                //go right
                floorIndex = guessIndex;
            }else {
                ceilingIndex = guessIndex;
            }
            
            if(floorIndex + 1 == ceilingIndex) {
                break;
            }
            
        }

        return ceilingIndex;
    }
}

















