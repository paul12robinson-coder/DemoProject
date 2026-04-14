package Demo;

public class Calculator 
{

	//global variable
		int a = 20;
		int b = 30;


		public void sum ()
		{
			a=200;

			//local variable
			int a=40;
			a=60;
			int b=50;
			int c = a+b; //110
			System.out.println("Sum of a&b: " + c);

		}

		public void sub()  //without argument parameter
		{
			int c = a-b;  //c - is called local variable
			System.out.println("substraction between a&b: " + c);
		}

		public void addition(int a, int b) //with argument
		{
			int c = a+b;
			System.out.println("addition between a&b: " + c);
		}

		public static void main(String[] args)

		{
			Calculator cal = new Calculator();
			cal.sub();
			cal.addition(30,40);

			//System.out.println(a + b); //50
			// System.out.println("a" + b); //a30
			// System.out.println("a" + "b"); //ab
			//System.out.println("Sum of a&b: " + b); //a30

		}
}
