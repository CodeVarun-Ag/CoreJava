package oops1;

public class studenttest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		student varun =new student(0, null, 0, 0);
		student rohan = new student(0, null, 0, 0);
		varun.sub1= 89;
		varun.sub2=98;
		rohan.sub1=88;
		rohan.sub2= 92;
		varun.name= "Varun";
		rohan.name="Rohan";
	
		varun.calaverage();
		rohan.calaverage();
		
		if (varun.average>rohan.average)
			varun.display();
		else
			rohan.display();

	}

}
