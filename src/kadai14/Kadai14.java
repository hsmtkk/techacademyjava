package kadai14;

import java.util.Random;

public class Kadai14 {
public static void main(String[]args) {
	Random rand = new Random();
	int totalNumber = rand.nextInt(100);
	int totalLegs = rand.nextInt(100);
	System.out.println("‡Œv “ª” " + totalNumber);
	System.out.println("‡Œv ‘«” " + totalLegs);

	int kame = (totalLegs - 2*totalNumber)/2;
	int turu = totalNumber - kame;
	
	
	if(turu >= 0 && kame >= 0 && totalNumber == turu + kame && totalLegs == (2 * turu + 4*kame)) {
		System.out.println("’ß" + turu);
		System.out.println("‹T" + kame);
	}
	else {
		System.err.println("•s³");
	}
}
}
