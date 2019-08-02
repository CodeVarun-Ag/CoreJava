package oops1;

public class sumgt5 {
	public static void main(String[] args){
		
		int n=59138,m,sum=0;
		while(n!=0)
		{
			m=n%10;
			if(m>5)
			{
				sum=sum+m;
			}
			n=n/10;
			
			
		}
		System.out.println("sum is "+ sum);
		
	}

}
