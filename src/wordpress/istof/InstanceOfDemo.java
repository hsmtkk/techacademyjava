package wordpress.istof;

public class InstanceOfDemo {
	public static void main(String[] args) {
		// 親クラスのインスタンスを作成する
		ParentClass p = new ParentClass();
		printInstance(p);

		System.out.println("---");
		
		// 子クラスのインスタンスを作成する
		ChildClass c = new ChildClass();
		printInstance(c);
	}
	
	private static void printInstance(Object obj) {
		// ParentClassのインスタンスか判定する
		if (obj instanceof ParentClass) {
			System.out.println("オブジェクトはParentClassのインスタンスです");
		}
		
		// ChildClassのインスタンスか判定する
		if (obj instanceof ChildClass) {
			System.out.println("オブジェクトはChildClassのインスタンスです");
		}
	}
}

// 親クラス
class ParentClass {
}

// ParentClassを継承する子クラス
class ChildClass extends ParentClass {
}
