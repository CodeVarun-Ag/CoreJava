
public class Overloading {
	int s;
	/**
	 * @param args
	 */
	public void add(int a, int b)
	{
		s=a+b;
		print();
	}
	
	public void add(int a,int b, int c ,int d)
	{
		s= a+b+c+d;
		print();
	}
	public void print() {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o= new Overloading();
		o.add(4, 5);
		o.add(4, 4, 1, 80);
		
	}

}
