package wordpress.bln;

public class BooleanDemo {

	public static void main(String[] args) {
		System.out.println("1 == 1 " + (1 == 1));
		System.out.println("1 == 2 " + (1 == 2));
		int a = 0;
		int b = 1;
		if (a == b) {
			System.out.println("true�̏ꍇ�Ɏ��s");
		} else {
			System.out.println("false�̏ꍇ�Ɏ��s");
		}
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i += 1;
		}
	}

}
