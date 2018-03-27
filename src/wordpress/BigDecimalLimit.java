package wordpress;

import java.math.BigDecimal;

public class BigDecimalLimit {
	public static void main(String[]args) {
		BigDecimal b = new BigDecimal(1);
		final BigDecimal TWO = new BigDecimal(2);
		while(true) {
			b = b.multiply(TWO);
			System.out.println(b);
		}
	}
}
