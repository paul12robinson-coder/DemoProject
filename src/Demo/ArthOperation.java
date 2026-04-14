package Demo;

public class ArthOperation 
{
	public ArthOperation()
	{
		int a=20;
		int b=30;
		int c = a+b;
		System.out.println("sum of a&b using contruct: " + c);

	}




	public int sum()
	{
		int a=20;
		int b=30;
		int c = a+b;

		return c;
		//System.out.println("sum of a&b: " +c );
		//System.out.println(e);

	}

	public void addtion(int a, int b)
	{

	int c = a+b;

	System.out.println("sum of a&b: " +c );

	}

	public ArthOperation(int a, int b)
	{
		int c = a+b;

		System.out.println("sum of a&b using contruct: " +c );
	}

	public static void main(String[] args)

	{
		ArthOperation ao1 = new ArthOperation();
		ArthOperation ao2 = new ArthOperation(100, 400);
		
		//Object d;
		int x = ao1.sum();
		//System.out.println(x);
		ao1.addtion(x, 100);
		ao2.addtion(x, 1500);
	}


}
