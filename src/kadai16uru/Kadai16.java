package kadai16uru;

import java.util.Random;

public class Kadai16 {
	public static void main(String[] args) {
		judgeLeapYear((new Random()).nextInt(3000));
		judgeLeapYear(4);
		judgeLeapYear(100);
		judgeLeapYear(2000);
	}
	
	private static void judgeLeapYear(int year) {
		if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println(year + "年はうるう年です");
		}
		else {
			System.out.println(year + "年は平年です");
		}		
	}
}
