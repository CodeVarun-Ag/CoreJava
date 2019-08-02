
public class findpairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={21,15,34,91,50,16,44};
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==65)
				{
					System.out.println(a[i]+"  "+a[j]);
				}
			}
		}

	}

}
