package kadai7fortune;

import java.util.Random;

public class Kadai73 {

	public static void main(String[] args) {
		String myBloodType = getRandomBloodType();
		String fortuneBloodType = getRandomBloodType();
		int age = (new Random()).nextInt(100);
		
		if (myBloodType.equals(fortuneBloodType)) {
			System.out.println("���Ȃ��̎v���ʂ�ɕ������i�݂����ł�");
			String msg = "";
			switch (myBloodType) {
			case "A":
				msg = "�������Ƃ����C���ŉ߂�������";
				break;
			case "B":
				msg = "�Ȃ肽���������v���`����";
				break;
			case "O":
				msg = "�����W���g";
				break;
			default:
				msg = "�{���ɑ�؂Ȃ��̂������Ă�����";
				break;
			}
			System.out.println(msg);
			
			if(20 <= age && age < 30) {
				System.out.println("20��: �l�Ƃ̐S�̋����ɋC������");
			}
			else {
				System.out.println("20��ȊO: �������Z���ɕς����܂�");
			}
		} else {
			System.out.println("�]�T���������s����S������");
		}
	}

	private static String getRandomBloodType() {
		String[] bloodTypes = { "A", "B", "O", "AB" };
		return bloodTypes[(new Random()).nextInt(bloodTypes.length)];
	}

}
