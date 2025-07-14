package curriculum_1_31;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	/*-----------------------------------------------------------------
	 問題1：クラスフィールド「count」を定義（初期値：0,データ型：int）
	-----------------------------------------------------------------*/
	private static int count = 0;
	
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		/*------------------------------------------------------------
		 問題2：Personコンストラクタでクラスフィールドcountに1を足す
		------------------------------------------------------------*/
		count++;
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// getterメソッドでcountフィールドの値を呼び出し元に返す（問題3）
	public static int getCount() {
		return count;
	}
	
	/*------------------------------------------------------------
	 問題4：クラスメソッド「printCount」を定義（データ型：void）
	------------------------------------------------------------*/
	public static void printCount() {
		/*-----------------------------------------------------------------
		 問題5：クラスフィールド「count」を用いて「合計〇〇人です」と出力
		-----------------------------------------------------------------*/
		System.out.println("合計" + count + "人です");
	}
	
}
