package kadai15museum;

import java.util.Random;

public class Kadai15 {

	public static void main(String[] args) {
		int number = (new Random()).nextInt(30);
		MuseumFee mf = new MuseumFee(number);
		System.out.println("人数 " + number);
		System.out.println("合計料金 " + mf.totalFee());
		System.out.println("一人当たり料金 " + mf.getFee());
	}

}
