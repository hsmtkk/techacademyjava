package kadai5adult;

import java.util.Random;

public class Kadai5 {

	public static void main(String[] args) {
		int age = (new Random()).nextInt(100);
		System.out.println(age + "��");
		if (0 <= age && age < 20) {
			sout("�����N");
		} else if (20 <= age) {
			sout("���l");
			if (20 <= age && age < 30) {
				sout("20��");
			} else if (30 <= age && age < 40) {
				sout("30��");
			} else {
				sout("�����N");
			}
		} else {
			sout("�s���ȔN��w��");
		}
	}

	private static void sout(String s) {
		System.out.println(s);
	}
}
