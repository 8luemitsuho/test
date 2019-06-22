import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		//値の記憶は add メソッドを利用
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		//値の取り消し
		for(int i = 0; i < list.size(); i++) {
			//値の取得は get メソッドを利用
			System.out.println(list.get(i));
		}

		//拡張 for 文を利用するともっと簡単
		for(String s : list) {
			System.out.println(s);
		}
	}
}
