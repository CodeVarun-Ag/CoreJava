package poi;

public abstract class Employee {
	 
	int eid;
	int rateperunit;
	String eName;
	public abstract  int cal_monthly_salary();

	public Employee(int eid, int rateperunit, String eName) {
		this.eid = eid;
		this.rateperunit = rateperunit;
		this.eName = eName;
	}
   
	public int getEid() {
		return eid;
	}

    public void setEid(int eid) {
		this.eid = eid;
	}

    public int getRateperunit() {
		return rateperunit;
	}

    public void setRateperunit(int rateperunit) {
		this.rateperunit = rateperunit;
	}

    public String geteName() {
		return eName;
	}

    public void seteName(String eName) {
		this.eName = eName;
	}

    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
