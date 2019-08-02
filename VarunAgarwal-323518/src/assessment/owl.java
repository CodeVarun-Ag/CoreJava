package assessment;

public  class owl extends Bird
{

	String eye_sight;
	public void setDetails(int id,int no,String eat,String found,String type,String eye)
	{
		Id=id;
		Total_number=no;
		Found=found;
		Types=type;
		eye_sight=eye;
	}
	public void getDetails()
	{
		
		System.out.println("Owl Id = "+Id+" Total_Number = "+Total_number+" Type of owl = "+Types+" Found in = "+Found+" Eye shight is = "+eye_sight);
	}

}