package oops1;

public class overloading {

	/**
	 * @param args
	 */
	int add(int x,int y)
	{
		int z;
		z=x+y;
		return z;
			
	}
	
	
	int add(int x,int y,int z)
	{
		int m=x+y+z;
		return m;
	}
	
	double add(double x,double y)
	{
		return x + y;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloading c = new overloading();
		System.out.println(c.add(4,6));
		System.out.println(c.add(4,6,8));
		System.out.println(c.add(4.2,6.3));
		
		

	}

}
