package oops1;

public class student {
	public int id;
	public String name;
	public int sub1;
	public int sub2;
	public float average;
	
	public void calaverage()
	{
		average = ((sub1 + sub2)/2);
		
	}
	
	public student(int id,String name,int sub1,int sub2)
	{
		this.id=id;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
	}
	


	public void display()
	{
		System.out.println("name :"+ (String) name +  " average is "+ average);
		
	}
}
	

