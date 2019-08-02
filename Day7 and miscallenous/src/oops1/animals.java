package oops1;

public class animals {
	int age;
	String type;
	float height;
	float weight;
	String color;
	int animalid;
	int nooflegs;
	boolean exsistence;
	String gender;
	
	
	
	public void displaydetails()
	{
		System.out.println("age "+age);
		System.out.println("type" +type);
		System.out.println("height "+height);
		System.out.println("weight"+weight);
		System.out.println("color"+color);
		System.out.println("animalid"+animalid);
		System.out.println("nooflegs"+nooflegs);
		System.out.println("exsistence"+exsistence);
		System.out.println("gender "+gender);
	}
	
	public void eat()
	{
		System.out.println("Animal eats /n");
	}

}
