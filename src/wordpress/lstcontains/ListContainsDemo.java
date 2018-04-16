package wordpress.lstcontains;

import java.util.ArrayList;
import java.util.List;

public class ListContainsDemo {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("����������");
		lst.add("����������");
		lst.add("����������");

		String[] searchTargets = { "����������", "�����ł�" };
		for (String s : searchTargets) {
			if (lst.contains(s)) {
				System.out.println("���X�g�͈ȉ��̗v�f���܂݂܂�: " + s);
			} else {
				System.out.println("���X�g�͈ȉ��̗v�f���܂݂܂���: " + s);
			}
		}

		List<String> anotherList = new ArrayList<String>();
		lst.add("����������");
		lst.add("����������");
		System.out.println(lst.containsAll(anotherList));
	}
}
