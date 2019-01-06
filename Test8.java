 class DisplayOverloading
{
   public void disp(char c)
   {
	   System.out.println(c);
   }
   
   public void disp(int i)
   {
	   System.out.println(i);
   }
}
class Test8
{
	public static void main(String args[])
	{
		DisplayOverloading d=new DisplayOverloading();
		d.disp('c');
		d.disp(10);
	}
}