package kadai3distance;

public class Kadai3 {

	public static void main(String[] args) {
		int mile = 2;
		int meter = mileToMeter(mile);
		System.out.println(String.format("%d�}�C����%d���[�g���ł��B", mile, meter));
		
		meter = 4800;
		mile = meterToMile(meter);
		System.out.println(String.format("%d���[�g����%d�}�C���ł��B", meter, mile));
	}

	private static int mileToMeter(int mile) {
		return mile * 1600;
	}
	
	private static int meterToMile(int meter) {
		return meter / 1600;
	}
}
