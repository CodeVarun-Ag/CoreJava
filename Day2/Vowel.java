import java.util.Scanner;
public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=getcharacter();
		boolean b=isVowel(ch);
		print(b,ch);
		
	}
	public static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			return true;
		else 
			return false;
	}
	public static char getcharacter()
	{
		Scanner sc= new Scanner(System.in);
		char ch;
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		return ch;
	}
	public static void print(boolean b, char ch) {
		if(b)
		System.out.println(ch + "is a vowel");
		else
			System.out.println(ch + "is a consonent");
		
	}
	

}
