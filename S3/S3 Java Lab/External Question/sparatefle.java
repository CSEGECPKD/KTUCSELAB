/*
Write a Java Program To read the numbers from a file Separate even and odd numbers using Threads and write the numbers in to separate files
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SeparateFile {
    public static void main(String[] args) {
        String inputFile = "/path/to/input/file.txt";
        String evenFile = "/path/to/even/output/file.txt";
        String oddFile = "/path/to/odd/output/file.txt";

        Thread evenThread = new Thread(() -> separateNumbers(inputFile, evenFile, true));
        Thread oddThread = new Thread(() -> separateNumbers(inputFile, oddFile, false));

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Numbers separated successfully.");
    }

    private static void separateNumbers(String inputFile, String outputFile, boolean isEven) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if ((number % 2 == 0 && isEven) || (number % 2 != 0 && !isEven)) {
                    writer.write(line + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}