package oops1;

public class testbank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b = new citi();
		System.out.println("citi roi :"+b.getroi());
		b = new icici();
		System.out.println("icici roi :"+b.getroi());
		
		

	}

}
