package kadai19date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Kadai192 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime after100day = now.plusDays(100);
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(format.format(convertLdtDate(now)));
		System.out.println(format.format(convertLdtDate(after100day)));
	}

	private static Date convertLdtDate(LocalDateTime ldt) {
		Date date = Date.from(ldt.toInstant(ZoneId.systemDefault().getRules().getOffset(ldt)));
		return date;
	}

}
