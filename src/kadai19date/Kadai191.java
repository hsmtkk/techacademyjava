package kadai19date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kadai191 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar after100day = Calendar.getInstance();
		after100day.add(Calendar.DATE, 100);
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(format.format(now.getTime()));
		System.out.println(format.format(after100day.getTime()));
	}

}
