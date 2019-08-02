package oops1;

public class testsbacc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*account acc1 = new account(3214);
		System.out.println(acc1.accdet());
		
		
		account acc2 = new account(3214,1000,9);
		System.out.println(acc2.accdet());*/
		
		
		sbacc sbacc1 = new sbacc();
		sbacc1.accno = 1232;
		sbacc1.accbal= 1000;
		sbacc1.intrate= 10;
		sbacc1.deposit(1000);
		System.out.println(sbacc1.accdet());
		sbacc1.withdraw(500);
		System.out.println(sbacc1.accdet());
		

	}

}
