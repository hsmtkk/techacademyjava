package kadai21match;

import java.util.Scanner;

public class Kadai21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1�l�ڂ̂����O��?");
		String firstName = scanner.nextLine();
		System.out.println("2�l�ڂ̂����O��?");
		String secondName = scanner.nextLine();
		scanner.close();

		int matchLevel = calcMatchLevel(firstName, secondName);
		System.out.println("��l�̑�����10�i�K��" + matchLevel + "�ł�");
	}

	private static int calcMatchLevel(String firstName, String secondName) {
		return (firstName.hashCode() + secondName.hashCode()) % 10 + 1;
	}

}
