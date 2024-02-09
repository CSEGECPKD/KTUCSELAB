/*
2	A bus booking app has the functionality to reverse the source and destination by a single command. For example The passenger travel Palakkad to Delhi can be reversed to Delhi to Palakkad. Write a JAVA program for this functionlality. Take the journey detail from the user as a single string eg. "Palakkad to Delhi" 
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the journey details (e.g., 'Palakkad to Delhi'):");
        String journey = scanner.nextLine();

        int toIndex = 0;
        for (int i = 0; i < journey.length() - 3; i++) {
            if (journey.charAt(i) == 't' && journey.charAt(i + 1) == 'o' && journey.charAt(i + 2) == ' ') {
                toIndex = i;
                break;
            }
        }

        String source = "";
        for (int i = 0; i < toIndex - 1; i++) {
            source += journey.charAt(i);
        }

        String destination = "";
        for (int i = toIndex + 3; i < journey.length(); i++) {
            destination += journey.charAt(i);
        }

        String reversedJourney = destination + " to " + source;

        System.out.println("Reversed journey: " + reversedJourney);
    }
}