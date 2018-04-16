package wordpress.lstcontains;

import java.util.ArrayList;
import java.util.List;

public class ListContainsDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("あいうえお");
		lst.add("かきくけこ");
		lst.add("さしすせそ");

		String[] searchTargets = { "かきくけこ", "たちつでと" };
		for (String s : searchTargets) {
			if (lst.contains(s)) {
				System.out.println("リストは以下の要素を含みます: " + s);
			} else {
				System.out.println("リストは以下の要素を含みません: " + s);
			}
		}

		List<String> anotherList = new ArrayList<String>();
		lst.add("かきくけこ");
		lst.add("さしすせそ");
		System.out.println(lst.containsAll(anotherList));
	}
}
