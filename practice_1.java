class a
{
	void fun1()
	{
		System.out.println("Message from parent class a");
	}
}
class b extends a
{
	void fun2()
	{
		System.out.println("Message from child class b");
	}
}
class test
{
	public static void main(String ar[])
	{
		test obj1=new test();
		obj1.fun2();
	}
}
	