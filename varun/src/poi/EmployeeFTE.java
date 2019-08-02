package poi;

public class EmployeeFTE extends Employee {
	int totaldaysworked;
	
	
	public EmployeeFTE(int totaldaysworked,int eid, int rateperunit, String eName) {
		super(eid, rateperunit, eName);
		this.totaldaysworked=totaldaysworked;
	}
	
	
	
	public int cal_monthly_salary()
	{
		
		int sal;
		sal = totaldaysworked*rateperunit;
		return sal;
	}
}
