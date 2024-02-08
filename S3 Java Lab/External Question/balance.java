java program to throw exception whenever customer balance is below 1000

class BalanceException extends Exception {
    public BalanceException(String message) {
        super(message);
    }
}

class Customer {
    private int balance;

    public Customer(int balance) {
        this.balance = balance;
    }

    public void checkBalance() throws BalanceException {
        if (balance < 1000) {
            throw new BalanceException("Customer balance is below 1000");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(500);
        try {
            customer.checkBalance();
            System.out.println("Balance is above 1000");
        } catch (BalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}