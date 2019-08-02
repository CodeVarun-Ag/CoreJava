import java.util.Scanner;
public class Marks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m= new int[3][4];
		float[] avg = new float[3];
		int s=0,temp=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<3;i++)
		{
			s=0;
			for(int j=0;j<4;j++)
			{
				s+=m[i][j];
			}
			avg[i]=s/4;
		}
		for(int i=0; i<3;i++)
		{
			System.out.println(avg[i]+"\t");
		}
		if(avg[0]>avg[1])
		{
			if(avg[0]>avg[2])
			{
				temp=0;
			}
			else
				temp=2;
		}
		else if(avg[1]>avg[2])
		{
			if(avg[1]>avg[0])
			{
				temp=1;
			}
			else
				temp=0;
		}
		else 
			temp=2;
		for(int j=0;j<4;j++)
		System.out.println("Marks of highest"+m[temp][j]+"  ");
		
	}

}
