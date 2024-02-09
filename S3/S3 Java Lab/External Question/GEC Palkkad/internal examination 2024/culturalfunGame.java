/*
For a cultural fun game, we want to call one student from S3 CSE and another student from S5 CSE randomly. Implement a program using thread, where one thread randomly pick one roll no from S3 and the another thread randomly pick a roll no from S5 CSE. Give appropriate delay to print each randomly selected Roll No. 
*/
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread s3Thread = new Thread(new StudentPicker("S3", 60));
        Thread s5Thread = new Thread(new StudentPicker("S5", 60));

        s3Thread.start();
        s5Thread.start();
    }
}

class StudentPicker implements Runnable {
    private String className;
    private int studentCount;

    public StudentPicker(String className, int studentCount) {
        this.className = className;
        this.studentCount = studentCount;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(5000));
            int rollNo = random.nextInt(studentCount) + 1;
            System.out.println("Randomly selected student from " + className + ": " + rollNo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}