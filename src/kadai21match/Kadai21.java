package kadai21match;

import java.util.Scanner;

public class Kadai21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1人目のお名前は?");
		String firstName = scanner.nextLine();
		System.out.println("2人目のお名前は?");
		String secondName = scanner.nextLine();
		scanner.close();

		int matchLevel = calcMatchLevel(firstName, secondName);
		System.out.println("二人の相性は10段階で" + matchLevel + "です");
	}

	private static int calcMatchLevel(String firstName, String secondName) {
		return (firstName.hashCode() + secondName.hashCode()) % 10 + 1;
	}

}
