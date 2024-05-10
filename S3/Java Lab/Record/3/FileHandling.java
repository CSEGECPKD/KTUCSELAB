import java.util.*;
import java.io.*;
class fileHandling 
{
    public static void main (String [] args )
    {
        try
        {
        FileReader fr = new FileReader("FileInput.txt");
        FileWriter fw = new FileWriter("Fileoutput.txt");
        String str ="";
        int i=0;
        while((i=fr.read())!=-1)
        {
            str +=char(i);
        }
        System.out.println(str);
        fw.write(str);
        fr.close();
        fw.close();
        System.out.println("File reading and writing both done");           
        }
        catch (IOException e)
        {
            System.out.println("there are some IOEXception");
        }

    }
}