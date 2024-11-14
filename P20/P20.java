//which quadrant the coordinate point lies
import java.util.Scanner;
public class P20
{
    private int x,y;
    public P20() {System.out.println("Empty const.");}
    public P20(int a,int b) {System.out.println("Para. const.");}
    public void setValue()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Value Of X: ");
        x=s.nextInt();
        System.out.print("Enter Value Of Y: ");
        y=s.nextInt();
    }
    private String calc() {
        if (x>0)
        {
            if (y>0) {
                return "The coordinate point ("+x+","+y+") lies in the first quadrant.";
            } else
                return "The coordinate point ("+x+","+y+") lies in the fourth quadrant.";
        } 
		else if (x<0) {
            if (y<0){
                return "The coordinate point ("+x+","+y+") lies in the third quadrant.";
            }
            else
                return "The coordinate point ("+x+","+y+") lies in the second quadrant.";

        }
        return "The coordinate point ("+x+","+y+") lies in the Center.";
    }
    public void display()
    {
        System.out.println(calc());
    }
}
