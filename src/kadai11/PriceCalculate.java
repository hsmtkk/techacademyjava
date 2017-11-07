package kadai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriceCalculate {

	private final int CHILD_PRICE = 0;
	private final int JUNIOR_PRICE = 1000;
	private final int HIGH_PRICE = 1200;
	private final int COLLEGE_PRICE = 1500;
	private final int ADULT_PRICE = 1800;

	private final int MOVIE_PRICE = 1000;
	private final int LADY_PRICE = 1200;
	private final int LATE_PRICE = 1500;

	public int calculatePrice(Customer customer) {
		List<Integer> prices = new ArrayList<Integer>();
		int age = customer.getAge();
		prices.add(calculateByAge(age));
		if (customer.isMovieDay()) {
			prices.add(MOVIE_PRICE);
		}
		if (customer.isLadyDay() && customer.getSex() == Sex.getFemale()) {
			prices.add(LADY_PRICE);
		}
		if (customer.isLateShow()) {
			prices.add(LATE_PRICE);
		}
		int price = Collections.min(prices);

		if (customer.is3D()) {
			price += 400;
		}
		return price;
	}

	private int calculateByAge(int age) {
		if (0 <= age && age < 6) {
			return CHILD_PRICE;
		} else if (6 <= age && age < 15) {
			return JUNIOR_PRICE;
		} else if (15 <= age && age < 18) {
			return HIGH_PRICE;
		} else if (18 <= age && age < 22) {
			return COLLEGE_PRICE;
		} else {
			return ADULT_PRICE;
		}
	}
}
