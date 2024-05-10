/*
Write a program that creates a user interface to perform integer divisions. The user enters two numbers in the text fields, Num1 and Num2. The division of Num1 and Num2 is displayed in the Result field when the Divide button is clicked. If Num1 or Num2 were not an integer, the program would throw a NumberFormatException. If Num2 were Zero, the program would throw an Arithmetic Exception Display the exception in a message dialog box
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionUI extends JFrame {

    // Text fields for input and result
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JTextField resultTextField;

    public IntegerDivisionUI() {
        // Set up the frame
        setTitle("Integer Division");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create a panel to hold the UI elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Labels and text fields for numbers and result
        JLabel num1Label = new JLabel("Num1:");
        num1TextField = new JTextField();
        JLabel num2Label = new JLabel("Num2:");
        num2TextField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField();
        resultTextField.setEditable(false); // Make result read-only

        // Button to perform the division
        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse input values as integers
                    int num1 = Integer.parseInt(num1TextField.getText());
                    int num2 = Integer.parseInt(num2TextField.getText());

                    // Perform the division and display the result
                    int result = num1 / num2;
                    resultTextField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    // Handle invalid input (non-integer)
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter integers only.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    // Handle division by zero
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add UI elements to the panel
        panel.add(num1Label);
        panel.add(num1TextField);
        panel.add(num2Label);
        panel.add(num2TextField);
        panel.add(resultLabel);
        panel.add(resultTextField);
        panel.add(divideButton);

        // Add the panel to the frame and display it
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule UI creation on the Swing event thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IntegerDivisionUI();
            }
        });
    }
}
