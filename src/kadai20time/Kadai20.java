package kadai20time;

import java.time.LocalDateTime;

public class Kadai20 {

	public static void main(String[] args) {
		int hour = LocalDateTime.now().getHour();
		if (7 <= hour && hour < 9) {
			System.out.println("���͂悤�������܂�");
		} else if (12 <= hour && hour < 14) {
			System.out.println("�������т���");
		} else {
			System.out.println("���̎��ԑ�");
		}
	}

}
