
class A {
	
	int num=100;
	
}

class Test3 extends A{
	
	int num=110;
	
	void printnumber()
	{
		System.out.println(super.num);
	}
	
	public static void main(String args[])
	{
		Test3 b=new Test3();
		b.printnumber();
	}
	
	
}

