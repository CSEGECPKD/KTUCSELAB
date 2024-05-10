/*
2. Write a Java Program for counting number of characters, words and lines in a file.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {

    public static void main(String[] args) {
        String filePath = "/D:/Shadil/vs code/Collage/javaLab2/External lab/counting.txt"; // Replace with your actual file path

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Count lines
                lineCount++;

                // Count characters
                charCount += line.length();

                // Count words without built-in functions
                boolean inWord = false;
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (isWhiteSpace(c)) {
                        if (inWord) {
                            wordCount++;
                            inWord = false;
                        }
                    } else {
                        inWord = true;
                    }
                }
                // Check for the last word
                if (inWord) {
                    wordCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }

    // Custom method to check if a character is whitespace
    private static boolean isWhiteSpace(char c) {
        return c == ' ' || c == '\t' || c == '\n';
    }
}
