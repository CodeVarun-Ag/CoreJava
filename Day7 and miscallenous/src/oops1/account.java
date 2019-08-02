package oops1;

public class account {
	int accno;
	float accbal;
	float intrate;
	
	public account(int accno)
	{
		this.accno= accno;
	}
	
	public account(int accno,float accbal, float intrate)
	{
		
		this.accno= accno;
		this.accbal = accbal;
		this.intrate = intrate;
	}
	
	
	
	
	public String accdet()
	{
		String str = "ACCNO :"+ accno + "\n"+ "Accbal :"+accbal +"\n"+"Intrate : "+ intrate;
		return str;
	
	}
	public float calinterest(float amt){
		
		return amt* intrate/100;
	}

}
