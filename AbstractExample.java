abstract class A
{
	abstract void fun1();
	void fun2()
	{
		System.out.println("fun 2 function from parent");
	}

	A()
	{
		System.out.println("constructor");

	}
	
}

class B extends A
{
	void fun1()
	{
		System.out.println("fun 1 function from child");
	}
}

class Example 
{
	public static void main(String[] args) {
			A obj = new B();
	}
}
