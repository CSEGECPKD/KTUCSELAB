// Represents a customer's account with a balance and minimum threshold
class Customer {
    private int balance;

    // Creates a customer with a balance, ensuring it's not negative
    public Customer(int initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Checks if the customer's balance meets the minimum threshold, throwing an exception if not
    public void checkBalance() throws InsufficientBalanceException {
        if (balance < 1000) {
            throw new InsufficientBalanceException("Balance is below the minimum of 1000.");
        }
    }
}

// Specific exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Main method to test the Customer class
public class bal {
    public static void main(String[] args) {
        try {
            // Create a customer with a starting balance of 500
            Customer customer = new Customer(500);

            // Attempt to check the balance (will throw an exception)
            customer.checkBalance();

            // This line won't execute if there's an exception
            System.out.println("Balance is above 1000."); // For demonstration

        } catch (InsufficientBalanceException e) {
            // Handle the exception by printing the error message
            System.out.println(e.getMessage()); // Prints: "Balance is below the minimum of 1000."
        }
    }
}
