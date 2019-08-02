import java.util.Scanner;
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0,r,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			s=(int) (s+Math.pow(r, 3));
			n=n/10;
		}
		if(temp==s)
			System.out.println(temp+" is an armstrong no.");
		else
			System.out.println(temp + " is not an armstrong no.");
	}

}
