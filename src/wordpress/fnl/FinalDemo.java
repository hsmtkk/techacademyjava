package wordpress.fnl;

public class FinalDemo {
	public static void main(String [] args) {
		final int a = 0; // 定数

		// これはコンパイルエラーとなる�??
		// a = 1;
	}
}

// 継承できな�?クラス
final class MyFinalClass {
}

// これはコンパイルエラーとなる�??
// class MyClass extends MyFinalClass {
// }
/*
class MyClass {
	// 継承できな�?メソ�?�?
	public final void method() {
	}
}

class MySubClass extends MyClass {
	// これはコンパイルエラーとなる�??
	// public void method() {
	// }
}
*/