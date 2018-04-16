package wordpress.intg;

public class IntDemo {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		String s = "123";
		int a = Integer.parseInt(s);
		System.out.println("•¶š—ñ" + s + "‚ğ”š‚Å•\‚·‚Æ" + a);

		s = "FF";
		a = Integer.parseInt(s, 16);
		System.out.println("•¶š—ñ" + s + "‚ğ”š‚Å•\‚·‚Æ" + a);
		
		s = "xyz";
		a = Integer.parseInt(s);
		System.out.println("•¶š—ñ" + s + "‚ğ”š‚Å•\‚·‚Æ" + a);
	}
}
