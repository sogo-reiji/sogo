package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	/*--------------------------------------------------------------------------------------------
	 Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成
	--------------------------------------------------------------------------------------------*/
	
	public static void hello(String name, int ver) {
	// 「Hello (name) (ver)」とコンソール出力
		System.out.println("Hello " + name + " " + ver);
	}
	
	/*--------------------------------------------------------------------------------
	 Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成
	--------------------------------------------------------------------------------*/
	
	public static void add(int x, int y) {
	// 引数のx,yを乗算し、計算結果を変数ansに代入
		int ans = x * y ;
	// 乗算した値をコンソール出力
		System.out.println(ans);
	}
	
	/*------------------------------------------------------------------------------------------
	 Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成
	------------------------------------------------------------------------------------------*/
	
	public static void printArray(int[] array) {
	// 拡張for文で引数の配列の要素を回す
		for(int element : array){
	// 配列の要素をコンソール出力
			System.out.println(element);
		}
	}
	
	/*-------------------------------------------------------------------------------------
	 Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
	-------------------------------------------------------------------------------------*/
	
	public static void add(double x, double y) {
	// 引数のx,yを和算し、計算結果を変数ansに代入
		double ans = x + y ;
	// 和算した値をコンソール出力
		System.out.println(ans);
	}
	
	/*-------------------------------------------------------------------------
	 Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	     格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成
	     ※0は出力＆格納しない
	-------------------------------------------------------------------------*/
	
	public static int[] printRandomNum(int x) {
	// ランダムの数字を格納する配列の宣言
		int [] randomNumArray = new int[x];
	// Randomクラスのインスタンスを生成
		Random random = new Random();
	// 乱数下限値：1
        int min = 1;
    // 乱数上限値：100
        int max = 100;
        
    // for文を使用して乱数の格納、コンソール出力処理
		for(int i = 0; i < x; i++) {
	// 1～100の乱数生成
			int randomNum =  random.nextInt((max - min) + 1) + min;
	// 生成された乱数を配列に代入
			randomNumArray[i] = randomNum;
	// 配列の要素をコンソール出力
			System.out.println(randomNumArray[i]);
		}
	// 戻り値指定
		return randomNumArray;
	}
	
	/*-------------------------------------------------------------------------------------
	 Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値を
	     コンソールに出力するメソッドを作成  ※小数点以下も表示
	-------------------------------------------------------------------------------------*/
	
	public static double average(int[] randomNumArray) {
	// 合計値計算用の変数sumの宣言、初期化
		double sum = 0.0;
	// 平均値計算用の変数avgの宣言、初期化
		double avg = 0.0;
	// 拡張for文を使用して配列要素を変数sumに加算
		for(double num : randomNumArray){
			 sum += num;
		}
	// 平均値計算
		avg = sum / randomNumArray.length;
	// 平均値計算結果をコンソール出力
		System.out.println(avg);
	// 戻り値指定
		return avg;
	}
	
	/*-------------------------------------------------------------------------------------
	 Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrue
	     それ以外はfalseを返しコンソールに出力
	-------------------------------------------------------------------------------------*/
	
	public static void checkNum(double average) {
	// averageの値が50以上か判定しboolean型変数に代入
		boolean result = average >= 50;
	// 判定結果をコンソール出力
        System.out.println(result);
	}
	
	/*---------------------------
	 作成したメソッドを呼び出し
	---------------------------*/
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
	// Q1
		hello("JavaSE",11);
	// Q2
		add(2,3);
	// Q3
		int[] array = {1,2,3};
		printArray(array);
	// Q4
		add(1.1,4.3);
	// Q5
		int[] randomNumArray = printRandomNum(2);
	// Q6
		double avg = average(randomNumArray);
	// Q7
		checkNum(avg);
		
	}

}
