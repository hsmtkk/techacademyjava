package wordpress.str;

public class StringDemo {
	public static void main(String [] args) {
		// String�N���X�̃C���X�^���X���쐬����
		String a = "����������";
		String b = "����������";
		System.out.println(a);
		System.out.println(b);
		
		// �������A�����A�V������������쐬����
		String c = a + b;
		System.out.println(c);

		// ������̒����𒲂ׂ�
		System.out.println("������c�̒���: " + c.length());
		
		// ��������r����
		String d = "����������";
		String e = "����������";
		System.out.println("==���Z�q�ɂ���r: " + e == d);
		System.out.println("equals���\�b�h�ɂ���r: " + e.equals(d));
	}
}
