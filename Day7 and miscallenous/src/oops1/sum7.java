package oops1;

public class sum7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15,sum=0;
		while(n<75)
		{
			if((n%7)==0)
			{
				sum= sum+ n;
			}
			n++;
		}
		System.out.println(sum);

	}

}
