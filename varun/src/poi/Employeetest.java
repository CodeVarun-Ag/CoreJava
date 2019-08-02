package poi;

public class Employeetest {
	
	 public static void main(String[] args) {
		 
		 
		 EmployeeConsultant a = new  EmployeeConsultant(8,1432,23000,"Varun");
		 System.out.println(a.cal_monthly_salary());
		 EmployeeFTE b = new  EmployeeFTE(9,1433,20000,"Rohan");
		 System.out.println(b.cal_monthly_salary()+" "+ b.geteName());
	 }
	 

}
