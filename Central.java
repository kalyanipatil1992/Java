interface AA
{
	int X=100;
}
interface BB
{
	int X=200;
}
interface cc extends AA,BB //Central implements AA,BB
{
	/*public void aaa()
	{
		System.out.println();
	}
	public int aaa()
	{
		System.out.println();
	}*/
	public static void main(String args[])
	{
		//System.out.println(X);
		System.out.println(AA.X);
		System.out.println(BB.X);
		
		//Central C=new Central();
		//C.aaa();
	}
}