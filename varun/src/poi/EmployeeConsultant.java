package poi;

public class EmployeeConsultant extends Employee {
	int totalhrsworked;
	
	public EmployeeConsultant(int totalhrsworked,int eid, int rateperunit, String eName) {
		super(eid, rateperunit, eName);
		this.totalhrsworked=totalhrsworked;
		
	}
	
	
	
	
	
	public int cal_monthly_salary()
	{
		
		int sal;
		sal = totalhrsworked*rateperunit;
		return sal;
	}
	

}
