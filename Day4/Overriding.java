
public class Overriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s= new SBI();
		System.out.println(s.get_roi());
		Bank b = new Bank();
		System.out.println(b.get_roi());
	}

}
