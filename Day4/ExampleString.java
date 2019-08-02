
public class ExampleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello How are you" , s1="Hello" , s2="hello";
		System.out.println(s.length());
		if(s1.compareToIgnoreCase(s2)==1)
			System.out.println("same");
		else
			System.out.println("Different");
		if(s1==s2)
			System.out.println("can");
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s.substring(2, 6));
		System.out.println(s.lastIndexOf('o'));
		
	}

}
