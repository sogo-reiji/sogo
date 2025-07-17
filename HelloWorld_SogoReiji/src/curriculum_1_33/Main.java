package curriculum_1_33;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木","太郎",20,1.7,60);
		person1.print();
		
		Person person2 = new Person("山田","花子",22,1.5,40);
		person2.print();
		
		Person.printCount();
		
		/*--------------------------------------------------------------------------
		 問題4：Carクラスのインスタンス「car」の所有者を「person1」に、
		        Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定。
		        Personクラスのインスタンスからフルネームを取得し、ownerにセット。
		--------------------------------------------------------------------------*/
		// Carクラスのインスタンス生成（問題4）
		Car car = new Car();
		// Bicycleクラスのインスタンス生成（問題4）
		Bicycle bicycle = new Bicycle();
		
		// person1のフルネームをcarのownerにセット（問題4）
		car.setOwner(person1.fullName());
		// person2のフルネームをbicycleのownerにセット（問題4）
		bicycle.setOwner(person2.fullName());
		
		/*-----------------------------
		 問題5：ownerをコンソール出力
		-----------------------------*/
		// carインスタンスのowner（問題5）
		System.out.println(car.getOwner());
		// bicycleインスタンスのowner（問題5）
		System.out.println(bicycle.getOwner());
		
		/*----------------------------------------------------------
		 問題10：buyメソッドを用いて「person1」がcarを購入、
		         「person2」がbicycleを購入するプログラムの作成。
		----------------------------------------------------------*/
		// person1インスタンスのbuyメソッド呼び出し（問題10）
		person1.buy(car);
		// person2インスタンスのbuyメソッド呼び出し（問題10）
		person2.buy(bicycle);
		
	}

}
