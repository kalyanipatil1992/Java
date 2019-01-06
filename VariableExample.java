
public class VariableExample 
{
	public String myVar="Instance Variable";
	
	public void myMethod()
	{
		String myVar="Loacal Veriable";
		System.out.println(myVar);
	}

	public static void main(String[] args) {
		
		VariableExample obj=new VariableExample();
	
		System.out.println("Calling Method");
		obj.myMethod();
		System.out.println(obj.myVar);
		

	}

}
