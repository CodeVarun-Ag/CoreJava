
public class digits {
	public static void check(float n) {
		int p,q;
		p=(int)n/10;
		q=(int)n%10;
		System.out.println(p);
		System.out.println(q);
		
	}
public static void main(String[] ar) {
	byte n=123,r;
	while(n>0)
	{
		r=(byte)((byte)n%10);
		System.out.println(r);
		n=(byte)((byte)n/10);
	}
	check(23.2f);
}
}