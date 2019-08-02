import java.util.Scanner;


public class EvenOdd {
	public static void main(String[] ar)
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no.");
		n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is an even no.");
		else
		System.out.println(n+" is a odd no.");
		
	}
}
