package wordpress.abst;

public class AbstractDemo {

	public static void main(String[] args) {
		// Catクラスをインスタンス化する
		Animal cat = new Cat();
		cat.animalCry();

		// Dogクラスをインスタンス化する
		Animal dog = new Dog();
		dog.animalCry();
	}

}

// 抽象クラス
abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void animalCry() {
		System.out.println(name + "の鳴き方: " + cry());
	}

	// 抽象メソッド
	// 具象クラスからのみアクセスするため、protected修飾とする
	abstract protected String cry();
}

// 具象クラス 1つ目
class Cat extends Animal {
	public Cat() {
		super("猫");
	}

	// メソッドを実装する
	protected String cry() {
		return "ニャー";
	}
}

//具象クラス 2つ目
class Dog extends Animal {
	public Dog() {
		super("犬");
	}

	// メソッドを実装する
	protected String cry() {
		return "ワン";
	}
}