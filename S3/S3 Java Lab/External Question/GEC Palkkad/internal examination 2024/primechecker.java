/*
4	Inorder to develop an GUI based prime checker write a program based on swing to read a number through a text box and display prime or not.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class primechecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prime Checker");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(10);
        JButton button = new JButton("Check");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(textField.getText());
                if (isPrime(num)) {
                    label.setText(num + " is a prime number.");
                } else {
                    label.setText(num + " is not a prime number.");
                }
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}