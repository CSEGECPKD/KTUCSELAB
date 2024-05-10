/*
Read characters from a file where the number of characters taken from user and reverse the character and print
*/
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseCharInFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "path/to/your/file.txt";

        // Specify the number of characters to read
        int numChars = 10; // Replace with the desired number of characters

        // Read the characters from the file
        String reversedChars = readAndReverseChars(filePath, numChars);

        // Print the reversed characters
        System.out.println(reversedChars);
    }

    public static String readAndReverseChars(String filePath, int numChars) {
        StringBuilder reversedChars = new StringBuilder();

        try (FileReader reader = new FileReader(new File(filePath))) {
            int c;
            int count = 0;

            // Read characters until the specified number is reached
            while ((c = reader.read()) != -1 && count < numChars) {
                reversedChars.insert(0, (char) c);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return reversedChars.toString();
    }
}