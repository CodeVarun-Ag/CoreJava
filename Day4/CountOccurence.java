import java.util.Scanner;
public class CountOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//String s="Hello how are you miss you";
		int n=0,f_index,l_index;
		String s;
		char ch;
		System.out.println("Enter string");
		s=sc.nextLine();
		System.out.println("Enter character to count");
		ch=sc.next().charAt(0);
		f_index=s.indexOf(ch);
		l_index = s.lastIndexOf(ch);
		//System.out.println(f_index + "   "+ l_index);
		for(int i=f_index;i<=l_index;i++)
			if(s.charAt(i)==ch)
				n++;
			if(n==0)
				System.out.println("Character not present");
		System.out.println(n);
	
	}

}
`