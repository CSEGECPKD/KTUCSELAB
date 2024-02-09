import java.awt.event.*;
import javax.swing.*;

class calculator implements ActionListener {
    JFrame f;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bmul, bsub, badd, bdiv, bdec, beq, bclr;
    static double a = 0, b = 0, result = 0;
    static int operator = 0;

    calculator() {
        f = new JFrame("calculator");
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        badd = new JButton("+");
        bsub = new JButton("-");
        bdiv = new JButton("*");
        bmul = new JButton("/");
        bdec = new JButton(".");
        beq = new JButton("=");
        bclr = new JButton("");

        // Set bounds and add action listeners for each button
        // ...

        f.add(t);
        f.add(b1);
        f.add(b2);
        // Add the rest of the buttons
        // ...

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 500);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t.setText(t.getText().concat("1"));
        }
        // Handle the rest of the buttons
        // ...

        if (e.getSource() == beq) {
            b = Double.parseDouble(t.getText());
            switch (operator) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                default:
                    result = 0;
            }
            t.setText(String.valueOf(result));
        }
        if (e.getSource() == bclr) {
            t.setText("");
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}