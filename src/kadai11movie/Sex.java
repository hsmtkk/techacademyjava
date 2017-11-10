package kadai11movie;

public class Sex {
	private static Sex male = new Sex();
	private static Sex female = new Sex();

	private Sex() {
	}

	public String toString() {
		if (this == male) {
			return "’j«";
		} else {
			return "—«";
		}
	}

	public static Sex getMale() {
		return male;
	}

	public static Sex getFemale() {
		return female;
	}
}
