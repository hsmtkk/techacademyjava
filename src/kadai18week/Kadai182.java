package kadai18week;

import java.time.LocalDateTime;

public class Kadai182 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		switch (now.getDayOfWeek()) {
		case SUNDAY:
		case SATURDAY:
			System.out.println("今日はおやすみです");
		default:
			System.out.println("お仕事頑張りましょう");
		}
	}
}
