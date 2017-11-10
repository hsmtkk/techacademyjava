package kadai13bigdecimal;

import java.math.BigDecimal;

public class Kadai13 {

	public static void main(String[] args) {
		kadai1();
		kadai2();
		kadai3();
		kadai4();
	}

	private static void kadai1() {
		BigDecimal v0 = new BigDecimal(Math.sqrt(2));
		BigDecimal v1 = v0.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(v1);
	}

	private static void kadai2() {
		BigDecimal width = new BigDecimal(2.2);
		BigDecimal height = new BigDecimal(3.3);
		BigDecimal area = width.multiply(height).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(area);
	}

	private static void kadai3() {
		BigDecimal width = new BigDecimal(4.4);
		BigDecimal height = new BigDecimal(5.5);
		BigDecimal area = calculateSquare(width, height).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(area);
	}

	private static BigDecimal calculateSquare(BigDecimal width, BigDecimal height) {
		return width.multiply(height);
	}

	private static void kadai4() {
		BigDecimal r = new BigDecimal(6.6);
		BigDecimal area = calculateCircleArea(r).setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal round = calculateCircleRound(r).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(area);
		System.out.println(round);
	}

	private static final BigDecimal PI = new BigDecimal(Math.PI);

	private static BigDecimal calculateCircleRound(BigDecimal r) {
		return (new BigDecimal(2)).multiply(PI).multiply(r);
	}

	private static BigDecimal calculateCircleArea(BigDecimal r) {
		return PI.multiply(r).multiply(r);
	}
}
