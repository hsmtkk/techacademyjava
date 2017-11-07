package kadai1variable;

public class Kadai1 {

	public static void main(String[] args) {
		String lastName = "佐藤";
		String firstName = "太郎";
		String name = lastName + firstName;
		String sex = "男性";
		String bloodType = "A";
		String birthLocation = "東京都";
		String hobby = "釣り";
		String s = String.format("私の名前は%sです。性別は%s、%s型です。出身地は%sで、趣味は%sです。", name, sex, bloodType, birthLocation, hobby);
		System.out.println(s);
	}

}
