 class ABC{
	
	 public void disp()
	 {
		 System.out.println("disp() method of parent class");
	 }
	
}
class Test12 extends ABC
{
	public void disp()
	{
		System.out.println("disp() method of child class");
	}
	
	public void newMethod()
	{
		System.out.println("child class method");
	}
	
	public static void main(String args[])
	{
		ABC a=new ABC();
		a.disp();
		
		ABC b= new Test12();
		b.disp();
	  //  b.newMethod();
		
		Test12 c=new Test12();
		c.newMethod();
		
	
	   
	}
}
