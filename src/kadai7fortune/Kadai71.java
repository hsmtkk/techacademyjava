package kadai7fortune;

import java.util.Random;

public class Kadai71 {

	public static void main(String[] args) {
		String myBloodType = getRandomBloodType();
		String fortuneBloodType = getRandomBloodType();
		
		if(myBloodType.equals(fortuneBloodType)) {
			System.out.println("���Ȃ��̎v���ʂ�ɕ������i�݂����ł�");
		}
		else {
			System.out.println("�]�T���������s����S������");
		}
	}
	
	private static String getRandomBloodType() {
		String[] bloodTypes = {"A", "B", "O", "AB"};
		return bloodTypes[(new Random()).nextInt(bloodTypes.length)];
	}

}
