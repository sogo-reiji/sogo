package curriculum_A;

import java.math.BigDecimal;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*-------------------------
		 1.変数宣言
		-------------------------*/
		
		// バイト型
		byte byte1;
		// 短整数型
		short short1;
		// 整数型
		int int1;
		// 長整数型
		long long1;
		// 単精度浮動小数点数型
		float float1;
		// 倍精度浮動小数点数型
		double double1;
		// 文字型
		char char1;
		// 文字列型
		String string1;
		// ブーリアン型
		boolean boolean1;
		
		
		/*-------------------------
		 2.変数の初期化
		-------------------------*/
		
		// バイト型
		byte byte2 = 0;
		// 短整数型
		short short2 = 0;
		// 整数型
		int int2 = 0;
		// 長整数型
		long long2 = 0;
		// 単精度浮動小数点数型
		float float2 = 0;
		// 倍精度浮動小数点数型
		double double2 = 0;
		// 文字型
		char char2 = '0';
		// 文字列型
		String string2 = "0";
		// ブーリアン型
		boolean boolean2 = false;
		
		
		/*---------------------------------------
		 3.初期化した変数に指定された値を代入
		---------------------------------------*/
		
		// バイト型
		byte2 = 10;
		// 短整数型
		short2 = 100;
		// 整数型
		int2 = 1000;
		// 長整数型
		long2 = 10000;
		// 単精度浮動小数点数型
		float2 = 9.5f;
		// 倍精度浮動小数点数型
		double2 = 10.5;
		// 文字型
		char2 = 'a';
		// 文字列型
		string2 = "ハロー";
		// ブーリアン型
		boolean2 = true;
		
		
		/*---------------------------------------
		 4.変数を使用してコンソール出力
		---------------------------------------*/
		
		// 「11110」とコンソール出力
		System.out.println(byte2 + short2 + int2 + long2);
		// 「20」とコンソール出力
		System.out.println(float2 + double2);
		// 「a ハロー true」とコンソール出力
		System.out.println(char2 + string2 + boolean2);
		// 「11130」とコンソール出力
		System.out.println(byte2 + short2 + int2 + long2 + float2 + double2);
		// 「10000000000」とコンソール出力
		System.out.println(byte2 * short2 * int2 * long2);
		// 「0.105」とコンソール出力
		System.out.println(double2 / short2);
		// 「-90」とコンソール出力
		System.out.println(byte2 - short2);
		
		
		// 改行
		System.out.println();
		
		
		/*---------------------------------------
		 5.「ハローJAVA43」と表示するように修正
		---------------------------------------*/
		
		String num = "20";
		// String型 → int型 に変換
		int num2 = Integer.parseInt( num );
		int num1 = 23;
		System.out.println("ハローJAVA" +( num1 + num2));
		
		
		// 改行
		System.out.println();
		
		
		/*-------------------------------------------------------------------------------------
		 6.『山田太郎 18歳 170.5cm 62.2kg 寿司』を変数に代入し、formatの通りにコンソール出力
		-------------------------------------------------------------------------------------*/
		// String型の変数nameを宣言し、山田太郎 を代入
		String name = "山田太郎";
		// int型の変数ageを宣言し、18 を代入
		int age = 18;
		// double型の変数heightを宣言し、170.5 を代入
		double height = 170.5;
		// double型の変数weightを宣言し、62.2 を代入
		double weight = 62.2;
		// String型の変数favoriteFoodを宣言し、寿司 を代入
		String favoriteFood = "寿司";
		
		//「初めまして山田太郎です」とコンソール出力
		System.out.println("初めまして" + name + "です");
		//「年齢は18歳です」とコンソール出力
		System.out.println("年齢は" + age + "歳です");
		//「身長は170.5㎝です」とコンソール出力
		System.out.println("身長は" + height + "cmです");
		//「体重は62.2kgです」とコンソール出力
		System.out.println("体重は" + weight + "kgです");
		//「好きな食べ物は寿司です」とコンソール出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		
		
		// 改行
		System.out.println();
		
		
		/*-----------------------------------------------------
		 7.6で作成した変数を使用して、BMIをコンソール出力
		-----------------------------------------------------*/
		
		// double型の変数bmiを宣言し、変数を用いてbmiの計算値を代入
		double bmi =  weight / ( ( height / 100 ) * ( height / 100 ) );
		// double→BigDecimal
		BigDecimal bdBmi = new BigDecimal(bmi);
		// 小数第2位を四捨五入
		BigDecimal bdBmi1 = bdBmi.setScale(1, BigDecimal.ROUND_HALF_UP);
		
		// 「BMIは○○です」とコンソール出力
		System.out.println("BMIは" + bdBmi1 + "です");
		
		
		// 改行
		System.out.println();
		
		
		/*-----------------------------------------------------
		 8.6で宣言した変数に再代入し、コンソール出力
		-----------------------------------------------------*/
		// 変数nameに鈴木一郎を再代入
		name = "鈴木一郎";
		// 変数ageに24を再代入
		age = 24;
		// 変数heightに168.5を再代入
		height = 168.5;
		// 変数weightに64.2を再代入
		weight = 64.2;
		// 変数faboriteFoodにオムライスを再代入
		favoriteFood = "オムライス";
		// 変数bmiにbmi計算結果を再代入
		bmi =  weight / ( ( height / 100 ) * ( height / 100 ) );
		// double→BigDecimal
		BigDecimal bdBmi2 = new BigDecimal(bmi);
		// 小数第2位を四捨五入
		BigDecimal bdBmi3 = bdBmi2.setScale(1, BigDecimal.ROUND_HALF_UP);
		
		//「初めまして鈴木一郎です」とコンソール出力
		System.out.println("初めまして" + name + "です");
		//「年齢は24歳です」とコンソール出力
		System.out.println("年齢は" + age + "歳です");
		//「身長は168.5㎝です」とコンソール出力
		System.out.println("身長は" + height + "cmです");
		//「体重は64.2kgです」とコンソール出力
		System.out.println("体重は" + weight + "kgです");
		//「好きな食べ物はオムライスです」とコンソール出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		// 「BMIは22.6です」とコンソール出力
		System.out.println("BMIは" + bdBmi3 + "です");
		
		
		// 改行
		System.out.println();
		
		
		/*-------------------------------------------------------------------------------------
		 9.8で使用した【年齢・身長・体重】の数値を和算で自己代入し、コンソール出力
		-------------------------------------------------------------------------------------*/
		
		// 変数ageが48になるように自己代入
		age = age + 24;
		// 変数heightが337.0になるように自己代入
		height = height + 168.5;
		// 変数weightが128.4になるように自己代入
		weight = weight + 64.2;
		// 変数bmiにbmi計算結果を再代入
		bmi =  weight / ( ( height / 100 ) * ( height / 100 ) );
		// double→BigDecimal
		BigDecimal bdBmi4 = new BigDecimal(bmi);
		// 小数第3位を四捨五入
		BigDecimal bdBmi5 = bdBmi4.setScale(2, BigDecimal.ROUND_HALF_UP);
		
		//「初めまして鈴木一郎です」とコンソール出力
		System.out.println("初めまして" + name + "です");
		//「年齢は48歳です」とコンソール出力
		System.out.println("年齢は" + age + "歳です");
		//「身長は337.0㎝です」とコンソール出力
		System.out.println("身長は" + height + "cmです");
		//「体重は128.4kgです」とコンソール出力
		System.out.println("体重は" + weight + "kgです");
		//「好きな食べ物はオムライスです」とコンソール出力
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		// 「BMIは11.31です」とコンソール出力
		System.out.println("BMIは" + bdBmi5 + "です");
		
		
		// 改行
		System.out.println();
		
		
		/*-----------------------------------------------------------
		 10.8で使用した年齢が25歳以上ならtrueが出力されるように処理
		-----------------------------------------------------------*/
		
		// 8で使用した変数age
		age = 24;
		
		// 比較演算子>=を使って「25歳以上ならtrue」の計算結果をコンソール出力
		System.out.println(age >= 25);
		
		
		// 改行
		System.out.println();
		
		
		/*--------------------------------------------------------------------------
		 11.8で使用した【年齢・身長・体重】を文字列型に型変換し、コンソール出力
		--------------------------------------------------------------------------*/
		
		// 8で使用した変数age
		age = 24;
		// int型変数ageをString型に変換
		String strAge = String.valueOf(age);
		// 8で使用した変数height
		height = 168.5;
		// double型変数heightをString型に変換
		String strHeight = String.valueOf(height);
		// 8で使用した変数weight
		weight = 64.2;
		// double型変数weightをString型に変換
		String strWeight = String.valueOf(weight);
		
		// String型に変換した変数strAgeをコンソール出力
		System.out.println("年齢は" + strAge + "歳です");
		// String型に変換した変数strHeightをコンソール出力
		System.out.println("身長は" + strHeight + "cmです");
		// String型に変換した変数strWeightをコンソール出力
		System.out.println("体重は" + strWeight + "kgです");
		
		
		// 改行
		System.out.println();
		
		
		/*-----------------------------------------------------------------------
		 12.11で変換した【年齢・身長】を整数型に変換し、コンソール出力
		-----------------------------------------------------------------------*/
		
		// String型変数strAgeをint型に変換
		int intAge = Integer.parseInt( strAge );
		// String型変数strHeightをdouble型に変換
		double dbHeight = Double.parseDouble( strHeight );
		// double型変数dbHeightをint型に変換
		int intHeight = (int)dbHeight;
		
		// int型に変換した変数intAgeをコンソール出力
		System.out.println("年齢は" + intAge + "歳です");
		// int型に変換した変数height3をコンソール出力
		System.out.println("身長は" + intHeight + "cmです");
		
		
		// 改行
		System.out.println();
		
		
		/*----------------------------------------------------------------------------------------------------
		 13.12で変換した【年齢・身長】で年齢が25もしくは身長が160以上であればtrueが出力されるように処理
		----------------------------------------------------------------------------------------------------*/
		
		// 論理演算子||を使って「年齢が25もしくは身長が160以上の場合true」の計算結果をコンソール出力
		System.out.println(intAge == 25 || intHeight >= 160);
		
	}

}
