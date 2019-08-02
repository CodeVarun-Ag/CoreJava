package oops1;

public class str2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "I am learning JAVA";
    int i=0,p=0;
    
    while(p!=-1)
    {
    	
    	p = s.indexOf(' ',i);
    	if(p!=-1)
    	System.out.println(s.substring(i, p));
    	else
    	System.out.println(s.substring(i));
    	i=p+1;
    	
    }
	
    		
	}

}
