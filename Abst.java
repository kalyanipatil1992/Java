abstract class Myclass {
	
	public void display()
	{
		System.out.println("Contrete method of psrent class");
	}
	
	abstract public void disp2();
}
class Abst extends Myclass
{
	public void disp2()
	{
		System.out.println("Overidden method of Abstract class");
	}
	
	public static void main(String args[])
	{
		
		Myclass ab=new Abst();
		ab.display();
		ab.disp2();
	}
}
