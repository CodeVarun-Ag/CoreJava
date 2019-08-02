package Varun1;

public class Student1 {
	
	int Sid,Java,Sel;
	String SName,Grade;
	double Average;
	
	
	double average(int Java,int Sel)
	
	{
		
		Average=(Java+Sel)/2;
		return Average;
		
		
	}
	
	void grade()
	{
		if(Average>70)
		{	Grade="FBD" ;
		}
		else if(Average<70
				&&Average>=50)
		{	Grade="1st" ;
		}
		else if(Average<50
				&&Average>=35)
		{	Grade="2nd" ;
		}
		else
		{
			Grade="Pass";
		}
		
		
	}

}
