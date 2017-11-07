package kadai11;

import java.util.Random;

public class Kadai11 {

	public static void main(String[] args) {
		Random r = new Random();
		int age = r.nextInt(30);
		Sex sex = Sex.getMale();
		if(r.nextBoolean()) {
			sex = Sex.getFemale();
		}
		Customer customer = new Customer(age, sex);
		int price = (new PriceCalculate()).calculatePrice(customer);
		System.out.println(customer);
		System.out.println(price);
	}

}
