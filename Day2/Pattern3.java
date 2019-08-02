
public class Pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			for(k=1;k<=3-i;k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		
	}

}
