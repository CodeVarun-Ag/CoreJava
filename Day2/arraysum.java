
public class arraysum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,5,7};
		int i,s=0,avg=0;
		for(i=0;i<ar.length;i++)
		{
			s+=ar[i];
		}
		avg=s/ar.length;
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]>avg)
				System.out.println(ar[i]);
		}
	}

}
