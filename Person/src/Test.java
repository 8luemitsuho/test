public class Test {
	public static void main(String[] args) {
		//Person
		Person taro = new Person(); {
		taro.name = "山田太郎";
		taro.age = 20;

		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age =18;
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		
		Person mitsuho = new Person();
		mitsuho.name = "寺崎満帆";
		mitsuho.age = 23;
		mitsuho.phoneNumber = "08013028487";
		mitsuho.address = "埼玉県草加市瀬崎1-1-26 202";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		System.out.println(mitsuho.name);
		System.out.println(mitsuho.age);
		System.out.println(mitsuho.phoneNumber);
		System.out.println(mitsuho.address);
		
		}
		
		//Robot
		Robot aibo = new Robot(); {
		aibo.name = "アイボ";
		
		Robot asimo = new Robot();
		asimo.name = "アシモ";
		
		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
		}
		
	}
}