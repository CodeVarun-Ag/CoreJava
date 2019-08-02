package oops1;

public class pattern5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i,j;
			for(i=1;i<=5;i++)
			{
				for(j=4;j>=i;j--)
				{
					System.out.print(" ");
				
				}
				for(j=4;j>=5-i;j--)
				{
				System.out.print(i+" ");
				}
				System.out.println();
				
			}
			for(i=4;i>=1;i--)
			{
				for(j=i;j<=4;j++)
				{
					System.out.print(" ");
				
				}
				for(j=4;j>=5-i;j--)
				{
				System.out.print(i+" ");
				}
				System.out.println();
				
			}
			

		}


	}


