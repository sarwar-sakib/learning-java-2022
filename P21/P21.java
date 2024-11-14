//find the eligibility of admission
import java.util.Scanner;
public class P21
{
    private int maths,phy,chem;
    public P21() {System.out.println("Empty const.");}
    public P21(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Input the marks obtained in Maths: ");
        maths=s.nextInt();
        System.out.print("Input the marks obtained in Physics: ");
        phy=s.nextInt();
        System.out.print("Input the marks obtained in Chemistry: ");
        chem=s.nextInt();
    }
    private String calc() {
        int total1 = maths + phy + chem;
        int total2 = maths + phy;
        if (maths>=65 && phy>=55 && chem>=50) {
            if (total1 >= 190 || total2 >= 140) {
                return "Total marks of Maths, Physics and Chemistry: " + total1 +
                        "\nTotal marks of Maths and Physics: " + total2 +
                        "\nThe candidate is eligible.";
            } else
                return "Total marks of Maths, Physics and Chemistry: " + total1 +
                        "\nTotal marks of Maths and Physics: " + total2 +
                        "\nThe candidate is not eligible.";
        }
        else
        {
        return "Total marks of Maths, Physics and Chemistry: "+total1+
                "\nTotal marks of Maths and Physics: "+total2+
                "\nThe candidate is not eligible.";}
    }
    public void display()
    {
        System.out.println(calc());
    }
}
