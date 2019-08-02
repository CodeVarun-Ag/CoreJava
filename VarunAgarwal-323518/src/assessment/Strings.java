package assessment;

public class Strings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i=0;
        String s="I have learnt loops, opps concepts, inheritance, exception handling, arraylist and string handling";
        s=s+" ";
        
            while(i<s.length())
            {   
                int k=s.indexOf(' ', i);
                if(k!=-1)
                {
                    int count=0;
                    String s1=s.substring(i,k);
                    
                    for(int l=0;l<(k-i);l++)
                    {
                    
                        if(s1.charAt(l)=='a' || s1.charAt(l)=='e' || s1.charAt(l)=='i' || s1.charAt(l)=='o' || s1.charAt(l)=='u' ||s1.charAt(l)=='A' || s1.charAt(l)=='E' || s1.charAt(l)=='I' || s1.charAt(l)=='O' || s1.charAt(l)=='U')
                        {
                            count++;
                        }
                        
                    }
                    if(count>=3)
                    {
                        System.out.println(s.substring(i,k));
                    }
                    
                    i=k+1;
                }
            
            }
        

    }

}
