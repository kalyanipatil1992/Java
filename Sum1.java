abstract class Demo1{
	
	public abstract int SumOfTwo(int n1,int n2);
	
	public abstract int SumOfTree(int n1,int n2,int n3);
	
	public void display()
	{
		System.out.println("Method of class Demo1");
	}

}

class Sum1 extends Demo1
{
	public int SumOfTwo(int n1,int n2)
	{
		return n1+n2;
	}
	
	public int SumOfTree(int n1,int n2,int n3)
	{
		return n1+n2+n3;
		
	}
	
	public static void main(String args[])
	{
		Demo1 d=new Sum1();
		System.out.println(d.SumOfTwo(4,5));
		System.out.println(d.SumOfTree(4,5,6));
		d.display();
	}
}
