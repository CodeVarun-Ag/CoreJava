package oops1;

public class pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			
			}
			for(j=4;j>=5-i;j--)
			{
			System.out.print(i);
			}
			System.out.println();
			
		}
		

	}

}
