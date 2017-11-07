package kadai7fortune;

import java.util.Random;

public class Kadai71 {

	public static void main(String[] args) {
		String myBloodType = getRandomBloodType();
		String fortuneBloodType = getRandomBloodType();
		
		if(myBloodType.equals(fortuneBloodType)) {
			System.out.println("あなたの思い通りに物事が進みそうです");
		}
		else {
			System.out.println("余裕をもった行動を心がけて");
		}
	}
	
	private static String getRandomBloodType() {
		String[] bloodTypes = {"A", "B", "O", "AB"};
		return bloodTypes[(new Random()).nextInt(bloodTypes.length)];
	}

}
