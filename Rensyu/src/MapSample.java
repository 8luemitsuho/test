import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	
	//値のセットは put メソッドを利用
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key3","value3");
		map.put("key4","value4");
		map.put("key5","value5");
		
	//値の取得
	String value= map.get("key1"); //value1 が取得できる
		System.out.println(value);
	
	String valueNull = map.get("key6"); //存在しない key の場合は　null
	System.out.println(valueNull);
	
	//mapに該当するkeyが存在するか否かチェックすることも可能
		if(map.containsKey("key1")) {
			System.out.println("key1は存在します");
		}else {
			System.out.println("key1は存在しません");
		}
	
	//拡張 for 文を利用してすべて情報を取得する
		for(Map.Entry<String,String> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}
