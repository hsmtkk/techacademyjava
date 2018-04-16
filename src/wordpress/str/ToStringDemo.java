package wordpress.str;

public class ToStringDemo {
	public static void main(String[] args) {
		WithoutToString wo = new WithoutToString("ABC");
		System.out.println(wo);
		
		WithToString w = new WithToString("DEF");
		System.out.println(w);
	}
}

class WithoutToString {
	private String name;

	public WithoutToString(String name) {
		this.name = name;
	}
}

class WithToString {
	private String name;

	public WithToString(String name) {
		this.name = name;
	}

	public String toString() {
		return "このオブジェクトの名前は" + name + "です";
	}
}
