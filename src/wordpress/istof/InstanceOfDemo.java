package wordpress.istof;

public class InstanceOfDemo {
	public static void main(String[] args) {
		// �e�N���X�̃C���X�^���X���쐬����
		ParentClass p = new ParentClass();
		printInstance(p);

		System.out.println("---");
		
		// �q�N���X�̃C���X�^���X���쐬����
		ChildClass c = new ChildClass();
		printInstance(c);
	}
	
	private static void printInstance(Object obj) {
		// ParentClass�̃C���X�^���X�����肷��
		if (obj instanceof ParentClass) {
			System.out.println("�I�u�W�F�N�g��ParentClass�̃C���X�^���X�ł�");
		}
		
		// ChildClass�̃C���X�^���X�����肷��
		if (obj instanceof ChildClass) {
			System.out.println("�I�u�W�F�N�g��ChildClass�̃C���X�^���X�ł�");
		}
	}
}

// �e�N���X
class ParentClass {
}

// ParentClass���p������q�N���X
class ChildClass extends ParentClass {
}
