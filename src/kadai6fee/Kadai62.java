package kadai6fee;

import java.util.Random;

public class Kadai62 {

	public static void main(String[] args) {
		String[] destinations = { "�k�C��", "���k", "�֓�", "�b�M�z", "����", "�ߋE", "�l��", "����", "��B", "����", "�����s", "���䓇" };
		String dest = destinations[(new Random()).nextInt(destinations.length)];
		int fee = 0;
		switch (dest) {
		case "�k�C��":
			fee = 1000;
			break;
		case "��B":
		case "����":
			fee = 950;
			break;
		case "���k":
		case "����":
			fee = 800;
			break;
		case "�֓�":
		case "�b�M�z":
		case "�l��":
			fee = 700;
			break;
		case "����":
			fee = 650;
			break;
		case "�ߋE":
			fee = 600;
			break;
		default:
			System.err.println("���̓f�[�^�G���[�ł�");
			return;
		}
		System.out.println(dest + "�ւ̑�����" + fee + "�~�ł�");
	}
}
