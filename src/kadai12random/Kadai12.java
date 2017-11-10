package kadai12random;

import java.util.Random;

public class Kadai12 {

	public static void main(String[] args) {
		// kadai1();
		// kadai2();
		// kadai3();
		kadai4();
	}

	private static void kadai1() {
		System.out.println((new Random()).nextInt(101));
	}

	private static void kadai2() {
		int n = (int) (1 + (Math.random() * 6));
		System.out.println(n);
	}

	private static void kadai3() {
		for (int i = 0; i < 10; i++) {
			int n = (int) (1 + Math.random() * 10);
			System.out.println(n);
		}
	}

	private static void kadai4() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int n = (int) (1 + Math.random() * 6);
			System.out.println((i + 1) + "ŒÂ–Ú " + n);
			sum += n;
		}
		System.out.println("‡Œv " + sum);
	}
}
