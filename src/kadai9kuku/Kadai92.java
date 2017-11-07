package kadai9kuku;

public class Kadai92 {

	public static void main(String[] args) {
		final String HALF_SPACE = "-";
		final String DOUBLE_SPACE = "Å]";
		String padding = HALF_SPACE + DOUBLE_SPACE + DOUBLE_SPACE;
		System.out.print(padding);
		for(int j=1 ; j<=9 ; j++) {
			String s = String.format("%3d", j);
			System.out.print(s);
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "ÇÃíi ");
			for (int j = 1; j <= 9; j++) {
				String s = String.format("%3d", i * j);
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
