package kadai1variable;

public class Kadai1 {

	public static void main(String[] args) {
		String lastName = "����";
		String firstName = "���Y";
		String name = lastName + firstName;
		String sex = "�j��";
		String bloodType = "A";
		String birthLocation = "�����s";
		String hobby = "�ނ�";
		String s = String.format("���̖��O��%s�ł��B���ʂ�%s�A%s�^�ł��B�o�g�n��%s�ŁA���%s�ł��B", name, sex, bloodType, birthLocation, hobby);
		System.out.println(s);
	}

}
