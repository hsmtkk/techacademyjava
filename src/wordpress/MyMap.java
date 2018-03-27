package wordpress;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> implements Map<K, V> {
	@Override
	public V get(Object key) {
		// 略
	}

	@Override
	public V put(Object key, Object value) {
		// 略
	}

	// その他、Mapインターフェースの要求するメソッドを実装する必要がある。
}

public class UseMyMap {
	public void useMyMap() {
		Map<String, String> map = new MyMap<String, String>();
		map.put("A", "あいうえお");
		map.put("B", "かきくけこ");
	}
}

public class UseHashMap {
	public void useHashMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "あいうえお");
		map.put("B", "かきくけこ");
	}
}