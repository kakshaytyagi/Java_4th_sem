class MyClass
{
	int x;	//Instance variable
	static int y; 	// static member variable

	public void fun1(int in)
	{
		x = in;
		System.out.println("instance member function");
	}

	public int fun_1()
	{
		return x;
	}

	public static void fun2()
	{
		y = 100;
		System.out.println("static member function");
	}

}

public class statClass
{
	public static void main(String []args)
	{
		MyClass m1 = new MyClass();
	        MyClass m2 = new MyClass();	

		m1.fun1(99);
		MyClass.fun2();

		System.out.println("value x, y = " + m1.fun_1() + " " + MyClass.y);


	}
}
		


