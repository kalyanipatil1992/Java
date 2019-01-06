
public class StaticVariableExample {
	
	public String myClassVar="Class or static variable";
	
	public static void main(String args[])
	{
		StaticVariableExample obj1= new StaticVariableExample();
		StaticVariableExample obj2= new StaticVariableExample();
		StaticVariableExample obj3= new StaticVariableExample();
		
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		obj2.myClassVar="Changed Text";
		
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}
}
