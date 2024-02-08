//java program to find longest textfile also handle exception if file not found
import java.io.File;
import java.io.IOException;

public class LongestTextFileFinder {
    public static void main(String[] args) {
        File directory = new File("path/to/directory");

        File longestTextFile = null;
        int maxLength = 0;

        try {
            if (directory.isDirectory()) {
                File[] files = directory.listFiles();

                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        int length = countCharacters(file);

                        if (length > maxLength) {
                            maxLength = length;
                            longestTextFile = file;
                        }
                    }
                }

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