package oops1;

public class sbacc extends account {
	public sbacc(int accno, float accbal, float intrate) {
		super(accno, accbal, intrate);
		// TODO Auto-generated constructor stub
	}
	public boolean withdraw(float withdrawamt)
	{
		if(accbal-withdrawamt >= 500)
		{
		accbal = accbal -withdrawamt;
		
		}
		return false;
	}
	public void deposit(float depositamt)
	{
		accbal = accbal +depositamt;
	}

}
