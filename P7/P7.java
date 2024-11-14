//Absolate value
import java.util.Scanner;
import java.lang.Math;
public class P7
{
    private int num;

    public P7()
    {
        System.out.println("Empty const.");
    }
    public P7(int a,int b)
    {
        System.out.println("Para. const.");
    }
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number For Absolute Value: ");
        num = s.nextInt();
        //num=a;
    }
    private String calc()
    {
        int abs=Math.abs(num);
        return "Absolute Value Is: "+abs;
        // System.out.println("Absolute Value Is: "+abs);
    }
    public void display()
    {
        System.out.println(calc());
    }
}
