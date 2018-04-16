package wordpress.file;

import java.io.File;
import java.nio.file.Paths;

public class FileDemo {
	public static void main(String[] args) {
		// 一覧を取得する対象の親フォルダ
		String targetFolderPath = "C:\\Program Files\\Java\\jdk-10";
		File targetFolder = new File(targetFolderPath);

		// フォルダ中の子フォルダ、ファイル一覧を取得し、ループする
		for (String name : targetFolder.list()) {
			// 親フォルダと、子フォルダ・ファイル名を結合し、絶対パスとする
			String path = Paths.get(targetFolderPath, name).toString();
			File f = new File(path);

			// フォルダかファイルかを判定する
			String type = "";
			if (f.isFile()) {
				type = "ファイル";
			} else if (f.isDirectory()) {
				type = "フォルダ";
			}

			// 種別、名前、サイズを表示する
			System.out.println(type + " " + name + " " + f.length());
		}
	}
}
