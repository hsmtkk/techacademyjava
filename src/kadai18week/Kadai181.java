package kadai18week;

import java.util.Calendar;

public class Kadai181 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int weekDay = now.get(Calendar.DAY_OF_WEEK);
		switch (weekDay) {
		case Calendar.SUNDAY:
		case Calendar.SATURDAY:
			System.out.println("�����͂��₷�݂ł�");
		default:
			System.out.println("���d���撣��܂��傤");
		}
	}

}
