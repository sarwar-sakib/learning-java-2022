//number of days in a month by number
import java.util.Scanner;
public class P33
{
    private int num1;
    public P33() {System.out.println("Empty const.");}
    public P33(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number Of Month: ");
        num1 = s.nextInt();
        //num1=a;
    }
    private String calc()
    {
        if (num1>0 && num1<=12) {
            if (num1 == 1) {
                return "January: Number of days in the month is 31";
            } else if (num1 == 2) {
                return "February: Number of days in the month is 28/29(Leap Year)";
            } else if (num1 == 3) {
                return "March: Number of days in the month is 31";
            } else if (num1 == 4) {
                return "April: Number of days in the month is 30";
            } else if (num1 == 5) {
                return "May: Number of days in the month is 31";
            } else if (num1 == 6) {
                return "June: Number of days in the month is 30";
            } else if (num1 == 7) {
                return "July: Number of days in the month is 31";
            } else if (num1 == 8) {
                return "August: Number of days in the month is 31";
            } else if (num1 == 9) {
                return "September: Number of days in the month is 30";
            } else if (num1 == 10) {
                return "October: Number of days in the month is 31";
            } else if (num1 == 11) {
                return "November: Number of days in the month is 30";
            } else {
                return "December: Number of days in the month is 31";
            }
        }
        else
            return "Index Exceed! \nThere are only 12 month";
    }
    public void display()
    {
        System.out.println(calc());
    }
}
