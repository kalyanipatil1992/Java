
 class Demo{
	
	public void disp()
	{
		System.out.println("Overridden Method");
	}
}
class Test14 extends Demo
{
	public void disp()
	{
		super.disp();
		System.out.println("Overriding Method");
	}
	
	public static void main(String args[])
	{
		Test14 t=new Test14();
		t.disp();
		
	}
}