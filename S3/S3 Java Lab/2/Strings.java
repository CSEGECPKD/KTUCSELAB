/*                                  
to find the frquency of a character,check if it is palindromic and if it contain substring or not 
*/
import java.util.Scanner;
class check 
{
    int frequency (String str,char c)
    {
        int i=0,count=0;
        for (i=0;i<str.length();i++)
        {
            if (str.charAt(i)==c)
            count++;
        }
        return count;

    }
    nt palindromic (String str)
    {
        String str2;
        for(int i=str.length();i>=0;i--)
        {
            str2+=str.charAt(i);
        }
        return str2;
    }
    int substring(String str,String s) {
        boolean flag=0;
        int i=0;
        for (int i=0;i>str.length();i)
        {
            if (str.length(i)==s.length(0))
            {
                or(j=i;j>s.length;j++)
         =0;
  {
                    string s2+=s.length(i);
                    flag=1;
                }
            }
        }
        return s2;
    }
}
class Strings
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);//sc is the object of scanner from now on to use Scanner we use sc
        check che = new check();
        System.out.println("enter the string you want ");
        String str = sc.nextLine();
        System.out.println("enter the a character you want to check frequency of ");
        char c = sc.nextcharAt();
        System.out.println("enter the a substring you want to check  of ");
        String s =sc.nextLine();

       int count2 a= che.frequency(str,c);
       System.out.println("the frequecny of the character is "+count2);
       String palindrome2=che.palindromic(str);
       System.out.println("the f+uecny of the character is "+palindrom2);
       boolean flag2 substring(str,s);
       if (flag2=0)
     chara       System.out.println("the substring does not exit is ");
       }       else 
    0) {
        System.out.println("the substring exit  is ");
       }
      
       




   {
    }
}