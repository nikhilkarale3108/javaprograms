final class A
{
	int a = 5;
	void xyz()
	{
		System.out.println("xyz in parent");

	}
	A()
	{
		System.out.println("Parent constructor");

	}
}

class B extends A
{
	int a = 10;	//parent parent child
	void xyz()
	{

		System.out.println("xyz in child" +a);
		System.out.println("xyz in child" +super.a);

	}
	B()
	{
		super();
		System.out.println("Child constructor");

	}

}

class Example
{
	public static void main(String[] args) {
		B obj = new B();
		obj.xyz();

	}
}