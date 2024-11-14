//Temperature check
import java.util.Scanner;
public class P27
{
    private int temp;
    public P27() {System.out.println("Empty const.");}
    public P27(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Temperature(Centigrade): ");
        temp= s.nextInt();
    }
    private String calc()
    {
            if (temp >= 40) {
                return "It's Very Hot";
            } else if (temp>= 30) {
                return "It's Hot";
            } else if (temp>= 20) {
                return "Normal in Temp.";
            } else if (temp>= 10) {
                return "Cold weather";
            } else if (temp>= 0) {
                return "Very Cold weather";
            } else
                return "Freezing Weather";
        }
    public void display()
    {
        System.out.println(calc());
    }
}
