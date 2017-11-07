package kadai7fortune;

import java.util.Random;

public class Kadai72 {

	public static void main(String[] args) {
		String myBloodType = getRandomBloodType();
		String fortuneBloodType = getRandomBloodType();

		if (myBloodType.equals(fortuneBloodType)) {
			System.out.println("あなたの思い通りに物事が進みそうです");
			String msg = "";
			switch (myBloodType) {
			case "A":
				msg = "ゆったりとした気分で過ごせそう";
				break;
			case "B":
				msg = "なりたい自分を思い描いて";
				break;
			case "O":
				msg = "情報収集が吉";
				break;
			default:
				msg = "本当に大切なものが見えてきそう";
				break;
			}
			System.out.println(msg);
		} else {
			System.out.println("余裕をもった行動を心がけて");
		}
	}

	private static String getRandomBloodType() {
		String[] bloodTypes = { "A", "B", "O", "AB" };
		return bloodTypes[(new Random()).nextInt(bloodTypes.length)];
	}

}
