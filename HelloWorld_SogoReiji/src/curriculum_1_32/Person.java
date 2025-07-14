package curriculum_1_32;

public class Person {
	private static int count = 0;
	private String firstName;
	/*--------------------------------------------------
	 問題1：インスタンスフィールドに「lastName」を追加
	--------------------------------------------------*/
	private String lastName;
	private int age;
	private double height, weight;
	
	/*-----------------------------------------------------------------
	 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義
	-----------------------------------------------------------------*/
	Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		/*-------------------------------------------------------------------------------------------------
		 問題3：コンストラクタに「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセット
		-------------------------------------------------------------------------------------------------*/
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// クラスフィールドcountに1を足す（問題3）
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
	
}
