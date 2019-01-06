
interface DemoInterface{

	public void method1();
	public void method2();
}
class MyInterface implements DemoInterface
{
	public void method1()
	{
		System.out.println("Implementation of method 1");
	}
	public void method2()
	{
		System.out.println("Implementation of method 2");
	}
	
	public static void main(String args[])
	{
		MyInterface i=new MyInterface();
		i.method1();
		i.method2();
	}
	
}
