package kadai7fortune;

import java.util.Random;

public class Kadai73 {

	public static void main(String[] args) {
		String myBloodType = getRandomBloodType();
		String fortuneBloodType = getRandomBloodType();
		int age = (new Random()).nextInt(100);
		
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
			
			if(20 <= age && age < 30) {
				System.out.println("20代: 人との心の距離に気をつけて");
			}
			else {
				System.out.println("20代以外: 長所も短所に変えられます");
			}
		} else {
			System.out.println("余裕をもった行動を心がけて");
		}
	}

	private static String getRandomBloodType() {
		String[] bloodTypes = { "A", "B", "O", "AB" };
		return bloodTypes[(new Random()).nextInt(bloodTypes.length)];
	}

}
