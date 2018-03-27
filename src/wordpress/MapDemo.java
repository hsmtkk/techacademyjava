package wordpress;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> nameAge = new TreeMap<String, Integer>();
		nameAge.put("太郎", 40);
		nameAge.put("次郎", 30);
		printNameAge(nameAge);
		nameAge = new HashMap<String, Integer>();
		nameAge.put("三郎", 20);
		nameAge.put("四郎", 10);
		printNameAge(nameAge);
	}

	private static void printNameAge(Map<String, Integer> map) {
		map.forEach((name, age) -> {
			System.out.println(name + "は" + age + "歳です。");
		});
	}
}
