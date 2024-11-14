//Attendance percentage
import java.util.Scanner;
public class P9
{
    private float num1,num2;
    public P9() {System.out.println("Empty const.");}
    public P9(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Number of classes held: ");
        num1 = s.nextInt();
        System.out.print("Number of classes attended: ");
        num2= s.nextInt();
        //num1=a;
        //num2=b;
    }
    private String calc()
    {
        float percent=(num2/num1)*100;
        if (percent>=75)
        {
            return "Allowed: Attendance "+percent+"%";
        }
        else if (percent<75)
        {
            Scanner s2=new Scanner(System.in);
            System.out.println("Do you had any medical cause? (Y/N): ");
            String ch=s2.nextLine();
            if (ch.equals("Y")|| ch.equals("y"))
            {
                return "Allowed: Attendance "+percent+"% with medical causes";
            }
              else
                  return "Not Allowed: Attendance "+percent+"%";
        }
        else
            return "";
    }

    public void display()
    {
        System.out.println(calc());
    }
}
