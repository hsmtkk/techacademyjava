package kadai14turukame;

import java.util.Random;

public class Kadai14 {
public static void main(String[]args) {
	Random rand = new Random();
	int totalNumber = rand.nextInt(100);
	int totalLegs = rand.nextInt(100);
	System.out.println("合計 頭数 " + totalNumber);
	System.out.println("合計 足数 " + totalLegs);

	int kame = (totalLegs - 2*totalNumber)/2;
	int turu = totalNumber - kame;
	
	
	if(turu >= 0 && kame >= 0 && totalNumber == turu + kame && totalLegs == (2 * turu + 4*kame)) {
		System.out.println("鶴" + turu);
		System.out.println("亀" + kame);
	}
	else {
		System.err.println("不正");
	}
}
}
