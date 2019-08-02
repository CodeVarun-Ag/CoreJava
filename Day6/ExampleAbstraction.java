abstract class Emp
{
	int eid,rate;
	public abstract int calculate_rate();
	public Emp(int eid, int rate)
	{
		this.eid = eid;
		this.rate = rate;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
		
}


public class ExampleAbstraction extends Emp {
	int hours;
	public ExampleAbstraction(int eid, int rate, int hours) {
		super(eid, rate);
		this.hours=  hours;
		
	}

	public int calculate_rate() {
		int sal=rate*hours; 
		return sal;
		
	}
public static void main(String[] ar) {
 
	ExampleAbstraction obj = new ExampleAbstraction(123, 1000,5);
	System.out.println("Salary is : "+obj.calculate_rate());

	
}
}
 