package Demo;

import org.testng.annotations.Test;

public class FirstClass 
{
	int a=10;
	float b=10.5f;
	char c='X';
	String d = "Java";
	static boolean e = true;

	@Test
	public void printdata()
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(e);
	System.out.println(d);

	}

public static void main(String[] args)
	{

		FirstClass fc = new FirstClass();

		fc.printdata();

		System.out.println(fc.b);
	}





}
