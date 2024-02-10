/*
Create a clans Sample with the following methods

aj To find the frequency of each vowel in a string

b) To display the ring without vowels
/
public class Sample {
    // Method to find the frequency of each vowel in a string
    public static void findVowelFrequency(String str) {
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a') {
                countA++;
            } else if (ch == 'e') {
                countE++;
            } else if (ch == 'i') {
                countI++;
            } else if (ch == 'o') {
                countO++;
            } else if (ch == 'u') {
                countU++;
            }
        }

        System.out.println("Frequency of 'a': " + countA);
        System.out.println("Frequency of 'e': " + countE);
        System.out.println("Frequency of 'i': " + countI);
        System.out.println("Frequency of 'o': " + countO);
        System.out.println("Frequency of 'u': " + countU);
    }

    // Method to display the string without vowels
    public static void displayWithoutVowels(String str) {
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String without vowels: " + result);
    }

    public static void main(String[] args) {
        String ring = "Hello, world!";
        findVowelFrequency(ring);
        displayWithoutVowels(ring);
    }
}