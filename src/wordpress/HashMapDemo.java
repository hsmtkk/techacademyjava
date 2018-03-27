package wordpress;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> wordCounter = new HashMap<String, Integer>();
		String[] words = { "bravo", "alpha", "charlie", "bravo" };
		for (String word : words) {
			int count = 0;
			if(wordCounter.containsKey(word)) {
				count = wordCounter.get(word);
			}
			wordCounter.put(word, count + 1);
		}
		wordCounter.forEach((word, count) -> {
			System.out.println("単語 " + word + " は " + count + " 回、出現しました。");
		});
	}
}
