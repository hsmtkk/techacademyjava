package kadai2gengou;

public class Kadai2 {
	private static final int HEISEI_GAN_NEN = 1988;
	
	public static void main(String[] args) {
		int heiseiYear = 29;
		int seirekiYear = convertHeiseiSeireki(heiseiYear);
		String s = String.format("����%d�N�͐���%d�N�ł�", heiseiYear, seirekiYear);
		System.out.println(s);
	}
	
	private static int convertHeiseiSeireki(int heiseiYear) {
		return heiseiYear + HEISEI_GAN_NEN;
	}

}
