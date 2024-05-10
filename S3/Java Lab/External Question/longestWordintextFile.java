//java program to find longest textfile also handle exception if file not found
import java.io.File;
import java.io.IOException;

public class LongestTextFileFinder {
    import java.io.File;
    import java.io.IOException;

    /**
     * This program finds the longest text file in a given directory and prints its name and length.
     */
    public class LongestWordInTextFile {
        /**
         * The main method is the entry point of the program.
         * It searches for the longest text file in a directory and prints its name and length.
         *
         * @param args The command-line arguments.
         */
        public static void main(String[] args) {
            // Specify the directory path
            File directory = new File("path/to/directory");

            // Variables to store the longest text file and its length
            File longestTextFile = null;
            int maxLength = 0;

            try {
                // Check if the specified path is a directory
                if (directory.isDirectory()) {
                    // Get all files in the directory
                    File[] files = directory.listFiles();

                    // Iterate through each file
                    for (File file : files) {
                        // Check if the file is a text file
                        if (file.isFile() && file.getName().endsWith(".txt")) {
                            // Count the number of characters in the file
                            int length = countCharacters(file);

                            // Update the longest text file and its length if necessary
                            if (length > maxLength) {
                                maxLength = length;
                                longestTextFile = file;
                            }
                        }
                    }

                    // Print the longest text file and its length
                    if (longestTextFile != null) {
                        System.out.println("Longest text file: " + longestTextFile.getName());
                        System.out.println("Length: " + maxLength);
                    } else {
                        System.out.println("No text files found in the directory.");
                    }
                } else {
                    System.out.println("Invalid directory path.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the files.");
            }
        }

        /**
         * Counts the number of characters in a text file.
         *
         * @param file The text file.
         * @return The number of characters in the file.
         * @throws IOException If an I/O error occurs while reading the file.
         */
        private static int countCharacters(File file) throws IOException {
            // Implementation of counting characters in a file
            // ...
            return 0;
        }
    }

    private static int countCharacters(File file) throws IOException {
        int count = 0;

        try (java.util.Scanner scanner = new java.util.Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                count += line.length();
            }
        }

        return count;
    }
}