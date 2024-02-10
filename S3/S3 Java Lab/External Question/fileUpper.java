/*
Write a program in JAVA to read a file and write it to another file with every alternate character inUpper case. Handle all the exceptions
*/
import java.io.FileReader;  // Import for reading files
import java.io.FileWriter;  // Import for writing files
import java.io.IOException; // Import for handling file-related exceptions

public class FileUpper {

    // Main method to run the program
    public static void main(String[] args) {

        try {
            // Create file readers and writers
            FileReader reader = new FileReader("input.txt");  // Reads from the file "input.txt"
            FileWriter writer = new FileWriter("output.txt");  // Writes to the file "output.txt"

            // Character variable to store each read character
            int character;

            // Flag to alternate between uppercasing and keeping original case
            boolean toUpperCase = true;

            // Read characters from the input file and write to the output file
            while ((character = reader.read()) != -1) {  // Read a character until the end of the file
                if (toUpperCase) {
                    // Convert to uppercase and write
                    writer.write(Character.toUpperCase((char) character));
                } else {
                    // Write the character as is
                    writer.write(character);
                }
                // Toggle the case flag for the next character
                toUpperCase = !toUpperCase;
            }

            // Close the files
            reader.close();  // Release resources
            writer.close();  // Release resources

            // Indicate success
            System.out.println("File conversion successful.");
        } catch (IOException e) {
            // Handle any file-related errors
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
