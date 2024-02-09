/*
A word matching game has stored two set of words in two seperate String arrays. The maching words are stored in a fashion that 1 st word in string array 1 match to 2nd word in string array 2 and vise versa. Implement a java program to concatinate matching words and store into another string array.
*/
public class Main {
    public static void main(String[] args) {
        String[] array1 = {"word1", "word2", "word3", "word4", "word5"};
        String[] array2 = {"word6", "word1", "word7", "word2", "word8"};
        String[] matchedArray = new String[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (i < array1.length - 1) {
                matchedArray[i] = array1[i] + array2[i + 1];
            }
            if (i > 0) {
                matchedArray[i] = matchedArray[i] + " " + array1[i] + array2[i - 1];
            }
        }

        // Print the matchedArray
        for (String word : matchedArray) {
            System.out.println(word);
        }
    }
}