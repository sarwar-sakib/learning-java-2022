public class Pos
{
	private int num;
	
	public Pos()
	{
		System.out.println("Empty Cons");
	}
	
	public Pos(int a)
	{
		System.out.println("Parameterize Cons");
	}
	
	public void set_value(int a)
	{
		num = a;
	}
	
	private String calc()
	{
		if ( num > 0)
		{
			return "Positive";
		}
		else
		{
			return "Negative";
		}
		
	}
	
	public void display()
	{
		System.out.println(calc());
	}
}