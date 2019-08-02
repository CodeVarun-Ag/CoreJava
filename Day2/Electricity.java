
public class Electricity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units=175;
		float amount=0.0f;
		if(units<=100)
		{
			amount=(float) (amount+ units*1.5);
		}
		else if(units>100 && units<=200)
		{
			amount=(float) (amount+100*1.5);
			units-=100;
			amount+=units*2;
		}
		else if(units>200 && units<=250)
		{
			amount+=100*1.5 + 100*2;
			units-=200;
			amount+=units*2.5;
		}
		else
		{
			amount+=100*1.5 + 100*2 + 50*2.5;
			units-=250;
			amount+=units*4;
		}
		System.out.println(amount);
			

	}

}
