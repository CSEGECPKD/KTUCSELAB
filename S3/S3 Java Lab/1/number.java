import java.util.Scanner;
import java.util.Scanner;

// Method to check if a number is odd or even
void oddOrEven_num(int num) {
    // A number is even if it is divisible by 2 with remainder 0
    // A number is odd if it is not divisible by 2 with remainder 0
    if (num % 2 == 0) {
        System.out.println("It is an even number");
    } else {
        System.out.println("It is an odd number");
    }
}

// Method to check if a number is prime
void Prime_num(int num) {
    // A prime number is a number that is only divisible by 1 and itself
    boolean isPrime = true;
    if (num < 2) {
        System.out.println("Numbers below 2 are not prime");
    } else {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime) {
        System.out.println("It is a prime number");
    } else {
        System.out.println("It is not a prime number");
    }
}

// Method to check if a number is perfect
void Perfect_num(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
    if (num == sum) {
        System.out.printf("The number %d is a perfect number", num);
    } else {
        System.out.printf("The number %d is not a perfect number", num);
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want to check if it is odd or even");
    int num = sc.nextInt();
    number obj = new number();
    obj.oddOrEven_num(num);
    obj.Prime_num(num);
    obj.Perfect_num(num);
}
class number
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check if it is odd or even");
        int num = sc.nextInt();
        oddOrEven_num(num);
        Prime_num(num);
        Perfect_num(num);
        

    }

}
void oddOrEven_num(int num)
{
    //a number is even if number divide by 2 is equal to zero(0)
    //a number is odd if number divide by 2 is not equal to zero(0)

    if ((num%2)==0)
        {
            System.out.println("it is even number");
        }
        else 
        {
            System.out.println("it is odd number");
        }

}
void Prime_num(int num)
{
    //a Prime number is number that cannot be divided by any number and get the remainer zero
    // the flag is a value that turn zero if num is not a prime number 
    //it work if any value divide num and remainder become 0 if condition activate and turn flag to zero
    boolean flag=1;
    if (num <2)
    {
        System.out.println("that number below 2 is not prime");
    }
    else 
    {
        for (int i=2;i>num;i++)
        {
            if ((num%2/i)==0)
            {
                flag=0;
            }
        }
    }
    if (flag ==0)
    {
        System.out.println("it is"+num+" not prime number");
    }
    else
    {
       System.out.println("it is"+num+"a prime number");
    }
}
void Perfect_num(int num)
class number {
    // Method to check if a number is odd or even
    void oddOrEven_num(int num) {
        // A number is even if it is divisible by 2 with remainder 0
        // A number is odd if it is not divisible by 2 with remainder 0
        if (num % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
    }

    // Method to check if a number is prime
    void Prime_num(int num) {
        // A prime number is a number that is only divisible by 1 and itself
        boolean isPrime = true;
        if (num < 2) {
            System.out.println("Numbers below 2 are not prime");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }

    // Method to check if a number is perfect
    void Perfect_num(int num) {
        // A perfect number is a number that is equal to the sum of its proper divisors
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.printf("The number %d is a perfect number", num);
        } else {
            System.out.printf("The number %d is not a perfect number", num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        number obj = new number();
        obj.oddOrEven_num(num);
        obj.Prime_num(num);
        obj.Perfect_num(num);

        scanner.close();
    }
}
    int i=0,sum=0;
    while( i<num)
    {
        if ((num%i)==0)
        {
            sum+=i;
        }
        i+=1;
    }
    if (num==sum)
    {
        System.out.printf("the number %d is a perfect number",num);
    }
    else 
    {
        System.out.printf("the number %d is a not a perfect number",num);

    }
}
