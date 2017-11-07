package kadai6fee;

import java.util.Random;

public class Kadai62 {

	public static void main(String[] args) {
		String[] destinations = { "–kŠC“¹", "“Œ–k", "ŠÖ“Œ", "bM‰z", "’†•”", "‹ß‹E", "l‘", "’†‘", "‹ãB", "‰«“ê", "“Œ‹“s", "”ªä“‡" };
		String dest = destinations[(new Random()).nextInt(destinations.length)];
		int fee = 0;
		switch (dest) {
		case "–kŠC“¹":
			fee = 1000;
			break;
		case "‹ãB":
		case "‰«“ê":
			fee = 950;
			break;
		case "“Œ–k":
		case "’†‘":
			fee = 800;
			break;
		case "ŠÖ“Œ":
		case "bM‰z":
		case "l‘":
			fee = 700;
			break;
		case "’†•”":
			fee = 650;
			break;
		case "‹ß‹E":
			fee = 600;
			break;
		default:
			System.err.println("“ü—Íƒf[ƒ^ƒGƒ‰[‚Å‚·");
			return;
		}
		System.out.println(dest + "‚Ö‚Ì‘——¿‚Í" + fee + "‰~‚Å‚·");
	}
}
