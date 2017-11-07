package kadai6fee;

import java.util.Random;

public class Kadai63 {

	public static void main(String[] args) {
		Random rand = new Random();
		int distance = rand.nextInt(1000);
		if(rand.nextBoolean()) {
			distance = -distance;
		}

		int fee = 0;
		if(0 <= distance && distance < 100) {
			fee = 600;
		}
		else if(100 <= distance && distance < 250) {
			fee = 800;
		}
		else if(250 <= distance && distance < 500) {
			fee = 900;
		}
		else if(500 <= distance) {
			fee = 1200;
		}
		else {
			System.err.println("入力データエラーです");
			return;
		}
		System.out.println(distance + "キロ先に荷物を送るための送料は" + fee + "円です");
	}

}
