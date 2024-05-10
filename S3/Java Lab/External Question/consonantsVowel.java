// Program to read a file, count vowels and consonants, and write results to another file

import java.io.*;

public class ConsonantsVowel {

    public static void main(String[] args) {
        try {
            // Input file and reader
            File inputFile = new File("input.txt");
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Output file and writer
            File outputFile = new File("output.txt");
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Variables to store results
            String line;
            int stringLength = 0;
            int vowelCount = 0;
            int consonantCount = 0;

            // Read each line from the input file
            while ((line = bufferedReader.readLine()) != null) {
                // Update string length
                stringLength += line.length();

                // Count vowels and consonants in each line
                for (int i = 0; i < line.length(); i++) {
                    char c = Character.toLowerCase(line.charAt(i));  // Convert character to lowercase

                    // Check if it's an alphabet
                    if (c >= 'a' && c <= 'z') {
                        if ("aeiou".indexOf(c) != -1) {  // Efficient vowel check
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
            }

            // Write results to the output file
            bufferedWriter.write("Length of the string: " + stringLength);
            bufferedWriter.newLine();
            bufferedWriter.write("Number of vowels: " + vowelCount);
            bufferedWriter.newLine();
            bufferedWriter.write("Number of consonants: " + consonantCount);

            // Close the files
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Output file has been written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
