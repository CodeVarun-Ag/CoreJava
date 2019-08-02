
public class ExampleException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int[] ar = new int[4];
		try{
		System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("/ by 0 error ");
		}
		try{
		System.out.println(ar[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array index out of bound");
		}
		System.out.println("Done");
		}

}
