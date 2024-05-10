/*
. Write a program to create a class student with attributes roll no,name, age and course.Initialize values through parameterised constructor .If age of student is not in between 15 and 21 then generate userdefined exception"age not within range exception".If name contains numbers or special symbols raise exception" name not valid exception". Define the two exception classes
*/
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range exception");
        }
        if (name.matches(".*\\d.*") || name.matches(".*[^a-zA-Z\\s].*")) {
            throw new NameNotValidException("Name not valid exception");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}