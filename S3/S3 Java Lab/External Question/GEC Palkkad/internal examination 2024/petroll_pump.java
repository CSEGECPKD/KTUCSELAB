/*
3	Dheeraj owns a petrol pump. He need a simple program to keep details of fuel and for daily fueling. Implement a class pump for him, which has the attributes petrol-keep record of available petrol, EngineOil-keeps reord of available engine oil. The pump has two functionality one to refillpump and another fuelvehicle. fuelvehicle can fuel a vehicle with petrol alone or petrol with Engineoil. While fueling the stock of petrol/Engineoil in the pump should reduce accordingly. During each fuelvehicle or refill time the system should show the details.
*/
public class Pump {
    private double petrol;
    private double engineOil;

    public Pump(double petrol, double engineOil) {
        this.petrol = petrol;
        this.engineOil = engineOil;
    }

    public void refillPump(double petrol, double engineOil) {
        this.petrol += petrol;
        this.engineOil += engineOil;
        printDetails();
    }

    public void fuelVehicle(double petrol, double engineOil) {
        if (this.petrol >= petrol && this.engineOil >= engineOil) {
            this.petrol -= petrol;
            this.engineOil -= engineOil;
        } else {
            System.out.println("Not enough stock to fuel the vehicle.");
        }
        printDetails();
    }

    private void printDetails() {
        System.out.println("Current stock - Petrol: " + petrol + ", Engine Oil: " + engineOil);
    }
}

public class Main {
    public static void main(String[] args) {
        Pump pump = new Pump(100, 50);
        pump.fuelVehicle(10, 5);
        pump.refillPump(20, 10);
        pump.fuelVehicle(50, 25);
    }
}