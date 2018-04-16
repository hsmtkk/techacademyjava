package wordpress.split;

public class SplitDemo {

	public static void main(String[] args) {
		String original = "alpha bravo charlie";
		for(String splitted: original.split(" ")){
			System.out.println(splitted);
		}
		
		System.out.println("---");
		
		original = "delta123echo456foxtrot";
		for(String splitted: original.split("\\d+")){
			System.out.println(splitted);
		}
	}
}
