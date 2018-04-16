package wordpress.json;

import com.google.gson.Gson;

public class JsonDemo {

	public static void main(String[] args) {
		// Person�N���X�̔z����쐬����
		Person[] persons = { new Person("alpha", 10), new Person("bravo", 20) };
		
		Gson gson = new Gson();
		
		// Person�N���X�̔z����AJSON������ɕϊ�����
		String jstr = gson.toJson(persons, Person[].class);
		System.out.println(jstr);

		// JSON��������APerson�N���X�̔z��ɕϊ�����
		persons = gson.fromJson(jstr, Person[].class);
		for (Person p : persons) {
			System.out.println(p);
		}
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}
