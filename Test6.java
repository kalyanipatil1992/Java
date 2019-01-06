class Parent
{
  void display()
  {
	  System.out.println("Parent calss methid");
  }
}
class Test6 extends Parent
{
	void display()
	{
		System.out.println("Child class method");
	}
	
	void printmsg()
	{
		display();
		
		super.display();
	}
	
	public static void main(String args[])
	{
		Test6 c=new Test6();
		c.printmsg();
		
	}
}


