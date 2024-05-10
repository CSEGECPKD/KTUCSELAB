/*
Write a java program that implements a multi-thread application that has three threads. First thread generates random integer every 1 second and if the value is even, second thread computes the square of the number and prints. If the value is odd, the third thread will print the value of cube of the number.
*/ 
import java.util.Random;

public class RandomThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RandomNumberGenerator());
        Thread thread2 = new Thread(new SquareCalculator());
        Thread thread3 = new Thread(new CubePrinter());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class RandomNumberGenerator implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                int number = random.nextInt();
                System.out.println("Generated number: " + number);
                if (number % 2 == 0) {
                    synchronized (SquareCalculator.lock) {
                        SquareCalculator.number = number;
                        SquareCalculator.lock.notify();
                    }
                } else {
                    synchronized (CubePrinter.lock) {
                        CubePrinter.number = number;
                        CubePrinter.lock.notify();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class SquareCalculator implements Runnable {
        static final Object lock = new Object();
        static int number;

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait();
                        int square = number * number;
                        System.out.println("Square: " + square);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class CubePrinter implements Runnable {
        static final Object lock = new Object();
        static int number;

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    try {
                        lock.wait();
                        int cube = number * number * number;
                        System.out.println("Cube: " + cube);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}