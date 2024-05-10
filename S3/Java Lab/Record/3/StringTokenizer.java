import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizer
{
    int k=0;
    int sum =0;
    Scanner sc = new Scanner (System.in);
    System.out.println(enter the numbers);
    String str = sc.nextLine();
    StringTokenizer s= new StringTokenizer (str);
    while(s.hasToken)
    {
        k =Integer.parseInt(s.nextToken)
        sum+=k;
    }
    System.out.println("the sum of the number is"+sum);
}