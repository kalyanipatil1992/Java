
class SuperClass 
{
	SuperClass()
	{
		System.out.println("no argument constructor of parent class");
	}
	
	SuperClass(String str)
	{
		System.out.println("parametrised constructor of parent class");
	}
}
class Test5 extends SuperClass
{
	Test5()
	{
		//super("Kalyani");
		
		System.out.println("Constructor of Child class");
		
	}
	void display()
	{
		System.out.println("Hello");
	}
	
	public static void main(String args[])
	{
		Test5 t=new Test5();
		t.display();
	}
}

