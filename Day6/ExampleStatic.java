class A
{
	int a=10;
	static int b=10;
	public A()
	{
		a++;
		b++;
	}
}

public class ExampleStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj= new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		A obj1 = new A();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		
	}

}
