package oops1;

public class pattern4 {
	
	
	public static void main(String[] args){
		int i,j;
		
		for(i=5;i>=1;i--)
		{
			for(j=i;j<=4;j++)
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
