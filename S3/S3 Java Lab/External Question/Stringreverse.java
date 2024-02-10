/*
 Create a class STRING with the following methods

a) To print the string with every word reversed without any built methods in JAVA

b) Find duplicate characters in a string

c) Reverse a string without using built in method
*/
import java.util.HashSet;

public class STRING {
    
    // Method to print the string with every word reversed
    public static void reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedString.append(reversedWord).append(" ");
        }
        
        System.out.println(reversedString.toString().trim());
    }
    
    // Method to find duplicate characters in a string
    public static void findDuplicateCharacters(String str) {
        HashSet<Character> duplicates = new HashSet<>();
        HashSet<Character> unique = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (!unique.add(ch)) {
                duplicates.add(ch);
            }
        }
        
        System.out.println("Duplicate characters: " + duplicates);
    }
    
    // Method to reverse a string
    public static void reverseString(String str) {
        StringBuilder reversedString = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        
        System.out.println(reversedString.toString());
    }
    
    public static void main(String[] args) {
        // Test the methods
        String str = "Hello World";
        
        System.out.println("Original string: " + str);
        System.out.print("Reversed words: ");
        reverseWords(str);
        
        System.out.print("Duplicate characters: ");
        findDuplicateCharacters(str);
        
        System.out.print("Reversed string: ");
        reverseString(str);
    }
}