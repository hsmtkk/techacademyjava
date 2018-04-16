package wordpress.file;

import java.io.File;
import java.nio.file.Paths;

public class FileDemo {
	public static void main(String[] args) {
		// �ꗗ���擾����Ώۂ̐e�t�H���_
		String targetFolderPath = "C:\\Program Files\\Java\\jdk-10";
		File targetFolder = new File(targetFolderPath);

		// �t�H���_���̎q�t�H���_�A�t�@�C���ꗗ���擾���A���[�v����
		for (String name : targetFolder.list()) {
			// �e�t�H���_�ƁA�q�t�H���_�E�t�@�C�������������A��΃p�X�Ƃ���
			String path = Paths.get(targetFolderPath, name).toString();
			File f = new File(path);

			// �t�H���_���t�@�C�����𔻒肷��
			String type = "";
			if (f.isFile()) {
				type = "�t�@�C��";
			} else if (f.isDirectory()) {
				type = "�t�H���_";
			}

			// ��ʁA���O�A�T�C�Y��\������
			System.out.println(type + " " + name + " " + f.length());
		}
	}
}
