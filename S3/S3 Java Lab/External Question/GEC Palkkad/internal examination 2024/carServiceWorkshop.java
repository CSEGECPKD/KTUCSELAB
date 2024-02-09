/*
A car servicing workshop running a program to maintain the details of the cars coming for service. The details of car include Vehicle No, Company(TATA, BENZ, Hundai etc), type(SUV, Sedan, Huchback), date of arrival. On arrival of each car the service person assign a number to the work(between 1 and 100), this number represents the expected deivery. For example a rank of 5 means its deliver faster thatn a rank of 9. Implement car as class, and create an array of cars to store the details of 10 cars. Get details of 10 cars and order the cars in ascending order based on rank number. 
*/
import java.util.Date;

class Car {
    String vehicleNo;
    String company;
    String type;
    Date arrivalDate;
    int rank;

    Car(String vehicleNo, String company, String type, Date arrivalDate, int rank) {
        this.vehicleNo = vehicleNo;
        this.company = company;
        this.type = type;
        this.arrivalDate = arrivalDate;
        this.rank = rank;
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        // Get the details of 10 cars from the user and store them in the array.
        // For example:
        // cars[0] = new Car("TN01AB1234", "TATA", "SUV", new Date(), 5);
        // cars[1] = new Car("TN01AB1235", "BENZ", "Sedan", new Date(), 9);
        // ...

        // Implement Bubble Sort to sort the array based on the rank.
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].rank > cars[j + 1].rank) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
        // Now the cars array is sorted in ascending order based on the rank.
    }
}