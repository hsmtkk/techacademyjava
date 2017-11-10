package kadai15museum;

import java.util.Random;

public class Kadai15 {

	public static void main(String[] args) {
		int number = (new Random()).nextInt(30);
		MuseumFee mf = new MuseumFee(number);
		System.out.println("l” " + number);
		System.out.println("‡Œv—¿‹à " + mf.totalFee());
		System.out.println("ˆêl“–‚½‚è—¿‹à " + mf.getFee());
	}

}
