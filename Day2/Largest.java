import java.util.Scanner;
public class Largest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 3 no.s");
			
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if(a>b)
			{
				if(a>c)
				{
					System.out.println(a + "is largest");
				}
				else
					System.out.println(c + "is largest");
				
			}
			else if(b>c)
			{
				if(b>a)
				{
					System.out.println(b + "is largest");
					
				}
				else
					System.out.println(a + "is largest");
				
			}
			else 
				System.out.println(c + "is largest");
			
			
	}

}
