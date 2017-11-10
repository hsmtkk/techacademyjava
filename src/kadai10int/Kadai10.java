package kadai10int;

public class Kadai10 {

	public static void main(String[] args) {
		String[] ss = new String[100];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = Integer.toString(i + 1);
			System.out.println(ss[i]);
		}
	}

}
