package curriculum_1_27;

/*---------------------------------------------------------------------------------------------------
 コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作成
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明
---------------------------------------------------------------------------------------------------*/

public class Animal {

	// 各情報のフィールド宣言
	private String name; // 動物名
	private double bodyLength; // 体長
	private int speed; // 速度
	
	// コンストラクタの定義
	public Animal(String name ,double bodyLength ,int speed) {
		// 引数の値で動物名フィールドを初期化
		this.name = name;
		// 引数の値で体長フィールドを初期化
		this.bodyLength = bodyLength;
		// 引数の値で速度フィールドを初期化
		this.speed = speed;
	}
	
	// getterメソッドで名前の値を呼び出し元に返す
	public String getName() {
		return this.name;
	}
	
	// getterメソッドで体長の値を呼び出し元に返す
	public double getBodyLength() {
		return this.bodyLength;
	}
	
	// getterメソッドで速度の値を呼び出し元に返す
	public int getSpeed() {
		return this.speed;
	}
	
	// switch文で学名を返すメソッド
	public String getScientificName() {
		
		switch (name) {
			// 動物名が"ライオン"の場合
			case "ライオン": 
				return "パンテラ レオ";
			// 動物名が"ゾウ"の場合
			case "ゾウ":
				return "ロキソドンタ・サイクロティス";
			// 動物名が"パンダ"の場合
			case "パンダ":
				return "アイルロポダ・メラノレウカ";
			// 動物名が"チンパンジー"の場合
			case "チンパンジー":
				return "パン・トゥログロディテス";
			// 動物名が"シマウマ"の場合
			case "シマウマ":
				return "チャップマンシマウマ";
			// 動物名が"インコ"の場合
			case "インコ":
				return "不明";
			// 上記以外の動物名が入力された場合
			default:
				return "不明";
		}
	}
	
	// 動物情報の出力メソッド
	public void printInfo() {
		System.out.println("動物名：" + getName()); // 動物名
		System.out.println("体長：" + getBodyLength() + "m"); // 体長
		System.out.println("速度：" + getSpeed() + "km/h"); // 速度
		System.out.println("学名：" + getScientificName()); // 学名
		System.out.println();
		
	}
	
}
