//if it is a square?
import java.util.Scanner;
public class P1
{
    private int len; int wid;
    public P1(){
        System.out.println("Empty const.");
    }
    public P1(int a,int b){
        System.out.println("Para. const.");
    }
    public void setValue(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length: ");
        len=s.nextInt();
        System.out.print("Enter Width: ");
        wid=s.nextInt();
        //len=a;
        //wid=b;
    }
    private String calc(){
        if (len==wid){
            return "Square";
        }
        else
            return "Not A Square";
    }
    public void display(){
        System.out.println(calc());
    }
}