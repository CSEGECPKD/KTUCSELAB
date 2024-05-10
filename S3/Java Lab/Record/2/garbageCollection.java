import java.util.*;
class employee
{
    int id;
    String name;
    Employee(int id,String name;int age)
    {
        this.id =id;
        this.name=name;
        this.age=age;
    }
    void show()
    {
        System.out.printf("employee id is %d  name is %s age is %d ",id,name,age);
    }
}
public class garbage 
{
    public static void main (Stirng [] args )
    {
        employee H = new employee(234,"hello",23);
        employee g = new employee(235,"kello",23);
        employee j= new employee(236,"mello",23);
        H.show();
        g.show();
        j.show();


        employee x = new employee(237,"gello",23);
        employee y = new employee(239,"aello",23);
        x.show();
        y.show();

        System.gc();
        System.runFinalization();

    }
}