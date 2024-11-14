//grade by marks
import java.util.Scanner;
public class P5
{
    private int marks;

    public P5()
    {
        System.out.println("Empty const.");
    }
    public P5(int a,int b)
    {
        System.out.println("Para. const.");
    }
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Mark: ");
        marks = s.nextInt();
        //marks=a;
    }
    private String calc()
    {
        if (marks>=0 && marks<=100)
        {
            if (marks > 80) {
                return "A";
            } else if (marks >= 60) {
                return "B";
            } else if (marks >= 50) {
                return "C";
            } else if (marks >= 45) {
                return "D";
            } else if (marks >= 25) {
                return "E";
            } else
                return "F";
        }
        else
            return "Invalid Number";
    }
    public void display()
    {
        System.out.println(calc());
    }
}
