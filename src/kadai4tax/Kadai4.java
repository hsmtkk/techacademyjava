package kadai4tax;

public class Kadai4 {

	private final static double TAX_RATE = 0.08;

	public static void main(String[] args) {
		int price = 250;
		int tax = calculateTax(price);
		int taxPrice = price + tax;
		System.out.println(String.format("%d‰~‚Ì¤•i‚ÌÅ‰¿Ši‚Í%d‰~(Á”ïÅ‚Í%d‰~)‚Å‚·B", price, taxPrice, tax));
	}

	private static int calculateTax(int price) {
		return (int) (price * TAX_RATE);
	}

}
