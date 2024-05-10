/*
1	A Newly constucting  shopping mall has spaces in shape of rectangle and circle for occupation. There are joint spaces like a cirlce is attached with a square. Implement a java program to calculate the area of different spaces using the concept of polymorphism.  A user  should have the provision to give the shape of space he want to occupy may be a rectangle with length and breadth, circle with its radius or a combination, the program should calculate  rent for the space. The rent rate is 2000 per square feet.    
*/
abstract class Space {
    abstract double calculateArea();
}

class Rectangle extends Space {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Space {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class CombinedSpace extends Space {
    Rectangle rectangle;
    Circle circle;

    CombinedSpace(Rectangle rectangle, Circle circle) {
        this.rectangle = rectangle;
        this.circle = circle;
    }

    @Override
    double calculateArea() {
        return rectangle.calculateArea() + circle.calculateArea();
    }
}

class RentCalculator {
    static final double RENT_RATE = 2000;

    static double calculateRent(Space space) {
        return space.calculateArea() * RENT_RATE;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(5);
        CombinedSpace combinedSpace = new CombinedSpace(rectangle, circle);

        System.out.println("Rent for rectangle: " + RentCalculator.calculateRent(rectangle));
        System.out.println("Rent for circle: " + RentCalculator.calculateRent(circle));
        System.out.println("Rent for combined space: " + RentCalculator.calculateRent(combinedSpace));
    }
}
