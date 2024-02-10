/*
Write a program to design a screen with two text boxes, start and stop buttons. Clicking on start button should start two threads printing 1 to 100 in two textboxes and stop using stop button.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoBox extends JFrame {
    private JTextField textBox1;
    private JTextField textBox2;
    private JButton startButton;
    private JButton stopButton;
    private Thread thread1;
    private Thread thread2;
    private boolean running;

    public TwoBox() {
        setTitle("Two Box");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textBox1 = new JTextField(10);
        textBox2 = new JTextField(10);
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = true;
                thread1 = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 100; i++) {
                            if (!running)
                                break;
                            textBox1.setText(String.valueOf(i));
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                });

                thread2 = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 100; i++) {
                            if (!running)
                                break;
                            textBox2.setText(String.valueOf(i));
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                });

                thread1.start();
                thread2.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                running = false;
            }
        });

        add(textBox1);
        add(textBox2);
        add(startButton);
        add(stopButton);
    }

    public static void main(String[] args) {
        TwoBox twoBox = new TwoBox();
        twoBox.setVisible(true);
    }
}