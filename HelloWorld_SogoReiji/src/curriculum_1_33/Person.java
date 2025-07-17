package curriculum_1_33;

public class Person {
	private static int count = 0;
	private String firstName;
	private String lastName;
	private int age;
	private double height, weight;
	
	Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}
	
	public String fullName() {
		return this.firstName + this.lastName;
	}
	
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	/*---------------------------------------------------------
	 問題6：インスタンスメソッド「buy」を定義（仮引数：car）
	---------------------------------------------------------*/
	public void buy(Car car) {
		/*--------------------------------------------------------------
		 問題7：setOwnerメソッドとthisを用いてownerフィールドをセット
		--------------------------------------------------------------*/
		car.setOwner(this.fullName());
		/*--------------------------------------------------------------
		 問題8：「〇〇が購入しました」とコンソール出力処理を追加
		--------------------------------------------------------------*/
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	/*--------------------------------------------------------------
	 問題9：引数の型が異なるbuyメソッドを定義（仮引数：bicycle）
	--------------------------------------------------------------*/
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	
}
