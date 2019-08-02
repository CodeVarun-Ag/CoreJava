package assessment;
public class Testbird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Parrot p1=new Parrot();
		Parrot p2=new Parrot();
		Parrot p3=new Parrot();
		
		
		
		
		p1.setDetails(123, 45, "Nuts1", "America1", "xyz1", "human1");
		p2.setDetails(124, 50, "Nuts2", "America2", "xyz2", "human2");
		p3.setDetails(125, 60, "Nuts3", "America3", "xyz3", "human3");
		p1.getDetails();
		p2.getDetails();
		p3.getDetails();

		owl o1=new owl();
		owl o2=new owl();
		
		
		
		
		o1.setDetails(456, 70, "Insects", "Poland", "abc1", "Very high");
		o2.setDetails(457, 80, "Insects2", "Green land", "abc2", "Low");
		o1.getDetails();
		o2.getDetails();
		
	}

}