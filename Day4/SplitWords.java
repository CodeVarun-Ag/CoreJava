import java.util.Scanner;
public class SplitWords {

	/**
	 * @param argss.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		String s = sc.nextLine();
		int i,l=0,index=0,temp=0;
		while(index>=0)
		{
			index=s.indexOf(' ',temp);
			if(index>=0)
			{
			temp=index+1;
			ar[l]=index;
			l++;
			}
		}
		//for(i=0;i<ar.length;i++)
			//System.out.println(ar[i]);
		int x=0;
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				System.out.println(s.substring(x, ar[i]));
				System.out.println("x= : "+x + "   ar[i]  : "+ar[i]);
				x+=ar[i]+1;
			}
			
			
		}
		System.out.println(s.substring(s.lastIndexOf(' ')+1,s.length()));
		
		
	}

}
