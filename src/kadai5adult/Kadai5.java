package kadai5adult;

import java.util.Random;

public class Kadai5 {

	public static void main(String[] args) {
		int age = (new Random()).nextInt(100);
		System.out.println(age + "歳");
		if (0 <= age && age < 20) {
			sout("未成年");
		} else if (20 <= age) {
			sout("成人");
			if (20 <= age && age < 30) {
				sout("20代");
			} else if (30 <= age && age < 40) {
				sout("30代");
			} else {
				sout("中高年");
			}
		} else {
			sout("不正な年齢指定");
		}
	}

	private static void sout(String s) {
		System.out.println(s);
	}
}
