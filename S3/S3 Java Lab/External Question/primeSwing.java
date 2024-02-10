/*
Write a program based on swing to read a number through a text box and display prime or no
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeSwing extends JFrame {
    private JTextField textField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PrimeSwing() {
        setTitle("Prime Number Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        textField = new JTextField(10);
        checkButton = new JButton("Check");
        resultLabel = new JLabel();

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                int number = Integer.parseInt(input);

                if (isPrime(number)) {
                    resultLabel.setText(number + " is a prime number");
                } else {
                    resultLabel.setText(number + " is not a prime number");
                }
            }
        });

        setLayout(new FlowLayout());
        add(textField);
        add(checkButton);
        add(resultLabel);

        setVisible(true);
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrimeSwing();
            }
        });
    }
}