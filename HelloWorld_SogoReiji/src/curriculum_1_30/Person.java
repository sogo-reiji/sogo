package curriculum_1_30;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Person {

	/*-----------------------------------
	 問題1：インスタンスフィールドを定義
	-----------------------------------*/
	private String name; // name
	private int age; // age
	private double height; // height
	// weightフィールドを定義（問題7）
	private double weight;
	// countフィールドを定義（問題10）
	private static int count;
	
	/*---------------------------------------------------
	 問題2：コンストラクタを定義（引数：name,age,height）
	---------------------------------------------------*/
	// 引数にweightを追加（問題7）
	Person(String name, int age, double height, double weight){
		/*---------------------------------------------------------------
		 問題3：コンストラクタの中で各インスタンスフィールドに値をセット
		---------------------------------------------------------------*/
		this.name = name; // name
		this.age = age; // age
		this.height = height; // height
		// 引数の値でフィールドを初期化（問題7）
		this.weight = weight;
		// インスタンス生成時にcountフィールドの値を＋1（問題10）
		count++;
	}
	
	/*-----------------------------------------------------------
	 問題6：インスタンスメソッド「bmi」を定義（戻り値：double）
	-----------------------------------------------------------*/
	public double bmi() {
		/*------------------------------------------
		 問題7：インスタンスのBMIを返すように処理
		------------------------------------------*/
		// 変数bmiを宣言し、BMI計算結果を代入
		double bmi = this.weight / (this.height * this.height);
		// double型をBigDecimal型に変換
		BigDecimal bdBmi = new BigDecimal(bmi);
		// 小数第2位を四捨五入
		bdBmi = bdBmi.setScale(0, RoundingMode.DOWN);
		// BigDecimal型をdouble型に変換し値を返す
		return bdBmi.doubleValue();
	}
	
	// getterメソッドでcountフィールドの値を呼び出し元に返す（問題10）
	public static int getCount() {
		return count;
	}
	
	/*-----------------------------------------------------------
	 問題8：インスタンスメソッド「print」を定義（戻り値：void）
	-----------------------------------------------------------*/
	public void print() {
		/*------------------------------------------
		 問題9：thisを用いて各情報をコンソール出力
		------------------------------------------*/
		System.out.println("名前は" + this.name + "です"); // 名前
		System.out.println("年は" + this.age + "才です"); // 年齢
		System.out.println("BMIは" + this.bmi() + "です"); // BMI
		System.out.println();
	}
}