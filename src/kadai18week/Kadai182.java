package kadai18week;

import java.time.LocalDateTime;

public class Kadai182 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		switch (now.getDayOfWeek()) {
		case SUNDAY:
		case SATURDAY:
			System.out.println("ç°ì˙ÇÕÇ®Ç‚Ç∑Ç›Ç≈Ç∑");
		default:
			System.out.println("Ç®édéñäÊí£ÇËÇ‹ÇµÇÂÇ§");
		}
	}
}
