 class CarClass {
	 
	 public int limitspeed()
	 {
		 return 100;
	 }
	
}
class Honda extends CarClass{
	
	public int limitspeed()
	{
		return 150;
	}
	
	public static void main (String args[])
	{
		CarClass c=new Honda();
		int i=c.limitspeed();
		System.out.println("Speed Limit is " +i);
		
	}
}
