package kadai7fortune;

import java.util.Random;

public class Kadai72 {

	public static void main(String[] args) {
		String myBloodType = getRandomBloodType();
		String fortuneBloodType = getRandomBloodType();

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
		} else {
			System.out.println("�]�T���������s����S������");
		}
	}

	private static String getRandomBloodType() {
		String[] bloodTypes = { "A", "B", "O", "AB" };
		return bloodTypes[(new Random()).nextInt(bloodTypes.length)];
	}

}
