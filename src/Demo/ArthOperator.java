package Demo;

public class ArthOperator 

{

	public ArthOperator()
	{
		System.out.println("As the world turn: by Paul Robinson");
	}

		/*

		 /*
		  *
		  */
	/*
	public ArthOperator(int a, int b)
	{
		int c = a+b;

		System.out.println("This is a test,using constuct: " + c);
	}
	*/
		public void sum()
	{
		int a=20;
		int b=30;
		int c = a+b;

		System.out.println("sum of a&b: " + c);
	}


	public void addition(int a, int b)
	{
		int c = a+b;

		System.out.println("sum of a&b: " + c);
	}



	public static void main(String[] args)
	{

		//ArthOperator ao = new ArthOperator(100, 100);
		ArthOperator ao = new ArthOperator();
		ao.sum();
		//ao.addition(3000,4000);
		//ao.addition(40,50);
	}

}

