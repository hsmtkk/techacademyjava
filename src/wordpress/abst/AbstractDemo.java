package wordpress.abst;

public class AbstractDemo {

	public static void main(String[] args) {
		// Cat�N���X���C���X�^���X������
		Animal cat = new Cat();
		cat.animalCry();

		// Dog�N���X���C���X�^���X������
		Animal dog = new Dog();
		dog.animalCry();
	}

}

// ���ۃN���X
abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void animalCry() {
		System.out.println(name + "�̖���: " + cry());
	}

	// ���ۃ��\�b�h
	// ��ۃN���X����̂݃A�N�Z�X���邽�߁Aprotected�C���Ƃ���
	abstract protected String cry();
}

// ��ۃN���X 1��
class Cat extends Animal {
	public Cat() {
		super("�L");
	}

	// ���\�b�h����������
	protected String cry() {
		return "�j���[";
	}
}

//��ۃN���X 2��
class Dog extends Animal {
	public Dog() {
		super("��");
	}

	// ���\�b�h����������
	protected String cry() {
		return "����";
	}
}