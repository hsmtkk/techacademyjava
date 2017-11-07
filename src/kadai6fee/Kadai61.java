package kadai6fee;

import java.util.Random;

public class Kadai61 {

	public static void main(String[] args) {
		Random rand = new Random();
		int weight = rand.nextInt(20);
		if (rand.nextBoolean()) {
			weight = -weight;
		}
		int fee = 0;

		if (0 <= weight && weight < 1) {
			fee = 250;
		} else if (1 <= weight && weight < 3) {
			fee = 400;
		} else if (3 <= weight && weight < 5) {
			fee = 500;
		} else if (5 <= weight && weight < 10) {
			fee = 900;
		} else if (10 <= weight) {
			fee = 1200;
		} else {
			System.err.println("入力データエラーです");
			return;
		}
		System.out.println(String.format("この荷物の重さは%dキロで送料は%d円です", weight, fee));
	}

}
