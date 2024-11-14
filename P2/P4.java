//5% bonus if YOS is more than 5
import java.util.Scanner;
public class P4
{
    private float salary, bonus, net;
    int year;

    public P4()
    {
        System.out.println("Empty const.");
    }
    public P4(int a,int b)
    {
        System.out.println("Para. const.");
    }
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        salary= s.nextInt();
        System.out.print("Enter Your Year of Service: ");
        year = s.nextInt();
        //salary= a;
        //year=b;
    }
    private String calc()
    {
        //float price=num*100,discP,total;
        if (year>5)
        {
            bonus=salary*0.05f;
            net=salary+bonus;
            return "Your Salary: \t"+salary+
                    "\nBonus(5%): \t\t+"+bonus+
                    "\nNet Salary: \t\t"+net;
        }
        else
            return "Your Salary: \t"+salary;
    }
    public void display()
    {
        System.out.println(calc());
    }
}
