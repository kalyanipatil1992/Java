
class Visibility{
	
	public void disp() {
		System.out.println("Parent class method");
		
}
}
class Test13 extends Visibility{
	
	public void disp()
	{
		System.out.println("Child class method");
	}
	
	public static void main(String args[]) {
		
		Visibility t=new Visibility();
		t.disp();
		
		Test13 t1=new Test13();
		t1.disp();
	}
}
