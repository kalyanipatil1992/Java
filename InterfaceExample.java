interface inf1
{
	public void method1();
}
interface inf2 extends inf1
{
	public void method2();
}
public class InterfaceExample implements inf2
{
	public void method1()
	{
		System.out.println("Implementation of inf1 method1");
	}
	public void method2()
	{
		System.out.println("Implementation of inf2 method2");
	}
	public static void main(String args[])
	{
		InterfaceExample IE=new InterfaceExample();
		IE.method1();
		IE.method2();
	}

}
