//Check Uppercase or Lowercase
import java.util.Scanner;
public class P11
{
    private char ch;
    public P11() {System.out.println("Empty const.");}
    public P11(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Any Character: ");
        ch=s.next().charAt(0);
    }
    private String calc()
    {
            if (ch >= 'A' && ch<='Z') {
                return "Uppercase";
            } else if (ch >= 'a' && ch<='z') {
                return "Lowercase";
            } else
                return "Not an Alphabet";
        }
    public void display()
    {
        System.out.println(calc());
    }
}
