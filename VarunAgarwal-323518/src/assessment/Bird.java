package assessment;

public abstract class Bird {

	int Id;
	int Total_number;
	String Eats;
	String Found;
	String Types;
	
	public abstract void setDetails(int id,int no,String eat,String found,String type,String eye);
	
	public abstract void getDetails();
}