
public class Words {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello everyone how are you";
		int i=s.indexOf(' ');
		System.out.println(i);
		String[] ar = new String[5];
		try{
		ar[0]=s.substring(0,i);
				System.out.println(ar[0]);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception" + e);
		}
	}

}
