package wordpress.rnd;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		String[] hands = { "�O�[", "�`���L", "�p�[" };
		Random r = new Random(0);
		for(int i=0 ; i<5 ; i++) {
			String hand = hands[r.nextInt(3)];
			System.out.println(hand);
		}
	}

}
