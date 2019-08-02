package Day4;


public class Prime {

	/**
	 * @param args
	 */
	public static boolean isPrime(int n)
	{
		for(int j=2;j <=n/2; j++)
		{
			if(n%j==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,i,l=0;
		for(i=2;i<100 && l<10;i++)
		{
			if(isPrime(i)){
				System.out.print("\t"+i);
				if(l>4)
				{
				s+=i;
				}
				l++;
			}
		}
		System.out.println("\n  Sum : "+s);
	}

}
