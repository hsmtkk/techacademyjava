package wordpress;

public class FinalDemo {
	public static void main(String [] args) {
		final int a = 0; // 定数

		// これはコンパイルエラーとなる。
		// a = 1;
	}
}

// 継承できないクラス
final class MyFinalClass {
}

// これはコンパイルエラーとなる。
// class MyClass extends MyFinalClass {
// }

class MyClass {
	// 継承できないメソッド
	public final void method() {
	}
}

class MySubClass extends MyClass {
	// これはコンパイルエラーとなる。
	// public void method() {
	// }
}
