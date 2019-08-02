package assessment;


public class Parrot extends Bird {
	String imitate;
	public void setDetails(int id,int no,String eat,String found,String type,String Imitate)
	{
		Id=id;
		Total_number=no;
		Found=found;
		Types=type;
		imitate=Imitate;
	}
	public void getDetails()
	{
		System.out.println("================================================================");
		System.out.println("Parrot Id = "+Id+" Total_Number = "+Total_number+" Type of owl = "+Types+" Found in = "+Found+" Imitate like = "+imitate);
	}

}
