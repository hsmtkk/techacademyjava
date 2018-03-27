package kadai6fee;

import java.util.Random;

public class Kadai62 {

	public static void main(String[] args) {
		String[] destinations = { "北海道", "東北", "関東", "甲信越", "中部", "近畿", "四国", "中国", "九州", "沖縄", "東京都", "八丈島" };
		String dest = destinations[(new Random()).nextInt(destinations.length)];
		int fee = 0;
		switch (dest) {
		case "北海道":
			fee = 1000;
			break;
		case "九州":
		case "沖縄":
			fee = 950;
			break;
		case "東北":
		case "中国":
			fee = 800;
			break;
		case "関東":
		case "甲信越":
		case "四国":
			fee = 700;
			break;
		case "中部":
			fee = 650;
			break;
		case "近畿":
			fee = 600;
			break;
		default:
			System.err.println("入力データエラーです");
			return;
		}
		System.out.println(dest + "への送料は" + fee + "円です");
	}
}
