
public class DivisibleRange {

	/**
	 * @param args
	 */
	
	public static boolean isDivisible(int n)
	{
		if(n%7==0 && n%11==0)
		{
			System.out.print("  "+n);
			return true;
			
		}
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s=0;
		for(i=0;i<=200;i++)
		{
			if(isDivisible(i))
			{
				s+=i;
			}
		}
		System.out.println("\n"+s);
	}

}
