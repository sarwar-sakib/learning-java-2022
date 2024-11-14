//Value of n
import java.util.Scanner;
public class P17
{
    private int m;

    public P17(){System.out.println("Empty Const.");}
	public P17(int a,int b){System.out.println("Parameterized Constructor");}

    public void setValue() 
	{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any Number: ");
        m = s.nextInt();
    }

    public int calc()
    {
        if(m < 0){
            return -1;
        }
        else if(m == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public void display()
    {
        System.out.println("Value of n = " + calc());
    }
}
