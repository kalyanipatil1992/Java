
class MethodOverLoading
{
    public void disp(char c)
    {
    	System.out.println(c);
    }
	public void disp(char c,int i)
	{
		System.out.println(c+ " " +i);
	}
}
class Test7
{
	public static void main(String args[])
	{
		MethodOverLoading obj=new MethodOverLoading();
		obj.disp('a');
		obj.disp('c',10);
		
	}
}