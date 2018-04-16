package wordpress.file;

import java.io.File;
import java.nio.file.Paths;

public class FolderWalk {

	public static void main(String[] args) {
		String startFolder = "C:\\Program Files\\Java\\jdk-10";
		FolderWalk demo = new FolderWalk();
		demo.listFolder(startFolder);
	}
	
	private void listFolder(String currentFolderPath) {
		System.out.println("フォルダ: " + currentFolderPath);
		File currentFolder = new File(currentFolderPath);
		for(String item: currentFolder.list()) {
			String path = Paths.get(currentFolderPath, item).toString();
			File f = new File(path);
			if(f.isFile()) {
				System.out.println("ファイル: " + path);
			}
			else if(f.isDirectory()) {
				listFolder(path);
			}
		}
		
	}

}
