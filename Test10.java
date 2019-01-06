
 class Test10{
	 
	 void disp(int a,double b)
	 {
		 System.out.println("Method A");
	 }
	
	 void disp(int a,double b,char c)
	 {
		 System.out.println("Method b");
	 }
	 
	 public static void main(String args[])
	 {
		 Test10 t=new Test10();
		 t.disp(100, 20.90f);
	 }

 }
