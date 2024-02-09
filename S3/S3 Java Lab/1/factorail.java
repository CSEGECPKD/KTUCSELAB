
//the first program in java s3 Java lab

import java.util.Scanner;
class factorail
{
    public static void main (String [] args)
    {   //it store the factorial sum the value is 1 since we multly it with num in the step below 0 * num=0
        int fac=1;
        //calling the scanner as object 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to find factorial of ");
        int num =sc.nextInt();
        while (num>=1)
        {
            fac = fac * num;
            num--;
        }
        System.out.println("the factorail of the num is "+fac);

    }
}