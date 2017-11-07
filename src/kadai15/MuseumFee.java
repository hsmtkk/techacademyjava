package kadai15;

public class MuseumFee {
	private final int STANDARD_FEE = 750;
	private final double DISCOUNT_RATE = 0.75;
	private int number;

	public MuseumFee(int number) {
		this.number = number;
	}
	
	public int getFee() {
		if(number >= 15) {
			return (int)(STANDARD_FEE * DISCOUNT_RATE);
		}
		else {
			return STANDARD_FEE;
		}
	}
	
	public int totalFee() {
		return number * getFee();
	}
}
