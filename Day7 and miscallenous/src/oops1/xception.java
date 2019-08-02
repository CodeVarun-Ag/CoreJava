package oops1;

public class xception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		try{
			
			
		
		int a=20,b=0,c;
		
		int[] b1= {22,34,87,99};
		
		System.out.println(a);
		
		c=a/b;
		
		System.out.println(c);
	
		System.out.println(b1[3]);
		
		System.out.println(b1[4]);
		
		
		}
		//catch(Exception e)
		//{
		//	System.out.println(e);
		
		//}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		
		System.out.println("outside catch block");
	}

}
