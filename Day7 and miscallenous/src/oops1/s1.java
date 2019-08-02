package oops1;

public class s1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0,i=0,c=0;
		String s = "I am learning Core Java", s1="hello", s2="Hello",s3;
		
		while(p!=-1)
		{	
		p = s.indexOf('a',i);
		i= p+1;
		c++;
		}
		System.out.println(c-1);
		
	}
	

}
