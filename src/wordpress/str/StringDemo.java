package wordpress.str;

public class StringDemo {
	public static void main(String [] args) {
		// Stringクラスのインスタンスを作成する
		String a = "あいうえお";
		String b = "かきくけこ";
		System.out.println(a);
		System.out.println(b);
		
		// 文字列を連結し、新しい文字列を作成する
		String c = a + b;
		System.out.println(c);

		// 文字列の長さを調べる
		System.out.println("文字列cの長さ: " + c.length());
		
		// 文字列を比較する
		String d = "さしすせそ";
		String e = "さしすせそ";
		System.out.println("==演算子による比較: " + e == d);
		System.out.println("equalsメソッドによる比較: " + e.equals(d));
	}
}
