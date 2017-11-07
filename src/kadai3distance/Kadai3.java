package kadai3distance;

public class Kadai3 {

	public static void main(String[] args) {
		int mile = 2;
		int meter = mileToMeter(mile);
		System.out.println(String.format("%dマイルは%dメートルです。", mile, meter));
		
		meter = 4800;
		mile = meterToMile(meter);
		System.out.println(String.format("%dメートルは%dマイルです。", meter, mile));
	}

	private static int mileToMeter(int mile) {
		return mile * 1600;
	}
	
	private static int meterToMile(int meter) {
		return meter / 1600;
	}
}
