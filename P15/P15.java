//If A Year Is a Leap Year or Not
import java.util.Scanner;
public class P15
{
    private int year;
    public P15() {System.out.println("Empty const.");}
    public P15(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A Year: ");
        year=s.nextInt();
    }
    private String calc() {
        if (year % 4 == 0 && year % 100 != 0) {
            return "Leap Year";
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return "Leap Year";
        } else
            return "Not A Leap Year";
    }
    public void display()
    {
        System.out.println(calc());
    }
}