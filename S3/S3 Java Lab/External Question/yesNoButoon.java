/*
1. Write a Java Program To create a frame containing 3 buttons YES, NO, Close. 
    When Button Yes/No is pressed, the message "Button Yes/No is pressed" gets displayed in label control. 
    On pressing Close button Frame window get closed.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class YesNoButton {
     public static void main(String[] args) {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel();
        panel.add(label);

        JButton yesButton = new JButton("YES");
        panel.add(yesButton);

        JButton noButton = new JButton("NO");
        panel.add(noButton);

        JButton closeButton = new JButton("Close");
        panel.add(closeButton);

        yesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button YES is pressed");
            }
        });

        noButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button NO is pressed");
            }
        });

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}