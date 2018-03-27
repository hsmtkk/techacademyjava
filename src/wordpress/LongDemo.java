package wordpress;

public class LongDemo {
	public static void main(String [] args) {
		int m = 2147483647;
		System.out.println(m);
		
		m += 1;
		System.out.println(m);

		long n = 2147483647;
		System.out.println(n);
	
		n += 1;
		System.out.println(n);
	}
}
