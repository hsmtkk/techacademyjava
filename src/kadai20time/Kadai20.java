package kadai20time;

import java.time.LocalDateTime;

public class Kadai20 {

	public static void main(String[] args) {
		int hour = LocalDateTime.now().getHour();
		if (7 <= hour && hour < 9) {
			System.out.println("おはようございます");
		} else if (12 <= hour && hour < 14) {
			System.out.println("お昼ご飯だよ");
		} else {
			System.out.println("他の時間帯");
		}
	}

}
