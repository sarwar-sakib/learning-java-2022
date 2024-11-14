//If eligible for casting vote
import java.util.Scanner;
public class P16
{
    private int age;
    public P16() {System.out.println("Empty const.");}
    public P16(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        age=s.nextInt();
    }
    private String calc() {
        if (age>=0 && age<=120)
        {
            if (age>=18) {
                return "Congratulation! You are eligible for casting your vote.";
            } else
                return "Sorry! You are not eligible for casting your vote. \nMinimum age limit is 18";
        }
        return "Exceed Normal Age limit";
    }
    public void display()
    {
        System.out.println(calc());
    }
}
