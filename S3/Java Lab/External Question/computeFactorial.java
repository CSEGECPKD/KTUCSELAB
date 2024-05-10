// Import necessary libraries for Applets, UI components, and events
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// Create an Applet class to handle factorial calculation
public class computeFactorial extends Applet implements ActionListener {

    // Declare UI components
    TextField inputField, outputField;  // Text fields for input and output
    Button computeButton;              // Button to trigger calculation

    // Initialize the Applet's layout and components
    public void init() {
        inputField = new TextField(10);  // Create input field with 10-character capacity
        outputField = new TextField(10); // Create output field with 10-character capacity
        computeButton = new Button("Compute"); // Create the button with label "Compute"

        // Add a listener to the button to handle clicks
        computeButton.addActionListener(this);

        // Add components to the Applet's layout
        add(new Label("Enter an integer:")); // Add a label for input
        add(inputField); // Add the input field
        add(computeButton); // Add the button
        add(new Label("Factorial value:")); // Add a label for output
        add(outputField); // Add the output field
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == computeButton) {  // Check if the compute button was clicked
            try {
                int number = Integer.parseInt(inputField.getText()); // Get the integer from the input field
                int factorial = computeFactorial(number); // Calculate the factorial
                outputField.setText(String.valueOf(factorial)); // Display the factorial in the output field
            } catch (NumberFormatException ex) {
                outputField.setText("Invalid input"); // Handle invalid input
            }
        }
    }

    // Recursive function to calculate factorial
    private int computeFactorial(int number) {
        if (number == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return number * computeFactorial(number - 1); // Recursive call
        }
    }
}
