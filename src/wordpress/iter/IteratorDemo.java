package wordpress.iter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		// ���X�g���쐬����
		List<String> list = new ArrayList<String>();
		list.add("alpha");
		list.add("bravo");
		list.add("charlie");

		// �C�e���[�^���擾���A���\�b�h���Ăяo��
		printIterable(list.iterator());

		// �Z�b�g���쐬����
		Set<String> set = new HashSet<String>();
		set.add("delta");
		set.add("echo");
		set.add("foxtrot");

		// �C�e���[�^���擾���A���\�b�h���Ăяo��
		printIterable(set.iterator());
	}

	private static void printIterable(Iterator<String> iterator) {
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
	}
}
