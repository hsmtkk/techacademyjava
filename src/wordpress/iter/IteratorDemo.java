package wordpress.iter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		// リストを作成する
		List<String> list = new ArrayList<String>();
		list.add("alpha");
		list.add("bravo");
		list.add("charlie");

		// イテレータを取得し、メソッドを呼び出す
		printIterable(list.iterator());

		// セットを作成する
		Set<String> set = new HashSet<String>();
		set.add("delta");
		set.add("echo");
		set.add("foxtrot");

		// イテレータを取得し、メソッドを呼び出す
		printIterable(set.iterator());
	}

	private static void printIterable(Iterator<String> iterator) {
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
	}
}
