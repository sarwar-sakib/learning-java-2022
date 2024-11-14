import java.util.Scanner;
public class main{
	public static void main(String [] args)
	{
		Pos obj = new Pos(2);
		Scanner s1= new Scanner(System.in);
		int a=s1.nextInt();
		obj.set_value(a);
		obj.display();
	}
}