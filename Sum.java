class Sum {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	
	public int add(int a,int b,int c, int d,int e)
	{
		return a+b+c+d+e;
	}
	public static void main(String args[])
	{
		Sum s=new Sum();
		System.out.println("Sum of two numbers :" +s.add(1,2) );
		System.out.println("Sum of three numbers :" +s.add(1,2,3));
		System.out.println("Sum of four numbers :" +s.add(1, 2,3,4));
		System.out.println("Sum of five numbers :" +s.add(1, 2,3,4,5));
	}
}
