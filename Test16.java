class Overloading{
	
	void demo( int a) {
		System.out.println("a : " +a);
	}
	
	void demo(int a, int b) {
		System.out.println("a and b : "+a +" " +b);
	}
	
	double demo( double d) {
		return d*d;
	}

}
class Test16 {
	public static void main(String args[]) {
		Overloading obj=new Overloading();
		double result;
		obj.demo(5);
		obj.demo(10,30);
		result=obj.demo(5.5);
		System.out.println("Result : " +result);
	}
}
