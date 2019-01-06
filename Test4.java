 class ParentClass{
	
	ParentClass()
	{
		System.out.println("Constructor of parent class");
    }
 }	
 class Test4 extends ParentClass{
	 
	 Test4()
	 {
		
	 System.out.println("Constructor of child class");
	 }
	 
	 Test4(int n)
	 {
		 System.out.println("arg constructror of child class");
	 }
	 
	 void display()
	 {
		 System.out.println("Hello");
	 }
	 
	 public static void main(String args[])
	 {
		 Test4 obj1=new Test4();
	     obj1.display();
	     
	     Test4 obj2=new Test4(4);
	     obj2.display();
}
}




	

