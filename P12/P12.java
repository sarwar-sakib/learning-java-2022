//Percentage and division
import java.util.Scanner;
public class P12
{
    private int roll,phy,chem,ca;
    private float percent;
    public String name;
    public P12() {System.out.println("Empty const.");}
    public P12(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        System.out.print("Input the Roll Number of the student: ");
        roll=s.nextInt();
        System.out.print("Input the Name of the Student: ");
        name=s2.nextLine();
        System.out.println("Input the marks of Physics, Chemistry and Computer Application: ");
        phy=s.nextInt(); chem=s.nextInt(); ca=s.nextInt();
    }
    public String calc() {
        int total = phy+chem+ca;
        percent =(float) total/3;
        return "Roll No: " +roll+
                "\nName of Student: " +name+
                "\nMarks in Physics: " +phy+
                "\nMarks in Chemistry: " +chem+
                "\nMarks in Computer Application: " +ca+
                "\nTotal Marks = " +total+
                "\nPercentage = "+percent;
        
        }
        private String calc2() {
            if (percent >= 60)
            {
                return "First Division";
            }
            else if (percent >= 50)
            {
                return "Second Division";
            }
            else if (percent >= 40)
            {
                return "Third Division";
            }
            return "Fail";
        }
    public void display()
    {
        System.out.println(calc());
        System.out.println(calc2());
    }
}