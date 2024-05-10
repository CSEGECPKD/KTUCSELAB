import java.util.Scanner;
/**
 * Represents an employee with basic information such as name, age, phone number, address, and salary.
 */
class employee 
{
    String name;
    int age;
    String phoneNo;
    String address;
    float salery;

    /**
     * Constructs an employee object with the specified details.
     * @param name the name of the employee
     * @param age the age of the employee
     * @param phoneNo the phone number of the employee
     * @param address the address of the employee
     * @param salery the salary of the employee
     */
    employee(String name, int age, String phoneNo, String address, float salery)
    {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salery = salery;
    }

    /**
     * Prints the details of the employee.
     */
    void details()
    {
        System.out.println("my name is " + name);
        System.out.println("my age is " + age);
        System.out.println("my phoneNO is " + phoneNo);
        System.out.println("my address is " + address);
        System.out.println("my salery is " + salery);
    }
}
class employee 
{
    String name;
    int age;
    String phoneNo;
    String address;
    float salery;

    employee(String name;int age;String phoneNo;String address;float salery)
    {
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
        this.address=address;
        this.salery=salery;
    }
    void details ()
    {
        System.out.println("my name is "+name);
        System.out.println("my age is "+age);
        System.out.println("my phoneNO is "+phoneNO);
        System.out.println("my address is "+address);
        System.out.println("my salery is "+salery);
    }

}
class officer extends employee
{
    officer(String name;int age;String phoneNo;String address;float salery,String specialization)
    {
        super(name,age,phoneNO,address,salery)
        this.specialization = specialization
    }
    System.out.println("the details of the officer is ");
    super.details();
    System.out.println("my specialization is "+specialization);
}
class Manager extends employee
{
    Manager(String name;int age;String phoneNo;String address;float salery,String departement)
    {
        super(name,age,phoneNO,address,salery)
        this.departement = departement
    }
    System.out.println("the details of the Manager is ");
    super.details();
    System.out.println("my departement is "+departement);
}
class inheritances
{
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the name of the officer");
    String name = sc.nextLine();
    System.out.println("enter the age of the officer");
    String age = sc.nextInt();
    System.out.println("enter the phone no of the officer");
    String phoneNO = sc.nextLine();
    System.out.println("enter the address of the officer");
    String address = sc.nextLine();
    System.out.println("enter the salery of the officer");
    float salery= sc.nextfloat();
    System.out.println("enter the specalization of the officer");
    String specalization = sc.nextLine();
    officer office = new officer(name,age,phoneNO,address,salery,specalization);

    Scanner sc = new Scanner (System.in);
    System.out.println("enter the name of the officerManager");
    String name = sc.nextLine();
    System.out.println("enter the age of the Manager");
    String age = sc.nextInt();
    System.out.println("enter the phone no of the Manager");
    String phoneNO = sc.nextLine();
    System.out.println("enter the address of the Manager");
    String address = sc.nextLine();
    System.out.println("enter the salery of the Manager");
    float salery= sc.nextfloat();
    System.out.println("enter the department of the Manager");
    String department = sc.nextLine();
    Manager manager = new Manager(name,age,phoneNO,address,salery,department);
}