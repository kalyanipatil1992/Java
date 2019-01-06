class B
{
     public void disp(char c, int i)
     {
    	 System.out.println("This is first definition of method display");
     }
  
     public void disp(int i,char c)
     {
    	 System.out.println("This is second definiftion of method display");
     }
}
class Test9
{
	public static void main(String args[])
	{
		B d=new B();
		d.disp(1,'d');
		d.disp('c',1);
		
	}
}