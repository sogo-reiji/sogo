package process_curriculum_1_29;

/*-----------------------------------------------------------------
コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
都道府県がソートされてコンソールに出力されるように作成
 ※Packageは2つ
 ※複数選択できるように定義
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"

例:
8,5,9,.....
と入力された場合（昇順）
	
都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2
-----------------------------------------------------------------*/

public class Prefecture {
	
	// 各情報のフィールド宣言
	private String name; // 都道府県名
	private String capital; // 県庁所在地
	private double area; // 面積
	
	// コンストラクタの定義
	public Prefecture(String name, String capital, double area) {
		// 引数の値で都道府県名フィールドを初期化
		this.name = name;
		// 引数の値で県庁所在地フィールドを初期化
		this.capital = capital;
		// 引数の値で面積フィールドを初期化
		this.area = area;
	}
	
	// getterメソッドで面積の値を呼び出し元に返す
	public double getArea() {
		return this.area;
	}
	
	// 都道府県情報の出力メソッド
	public void printInfo() {
		System.out.println("都道府県名：" + this.name); // 都道府県名
		System.out.println("県庁所在地：" + this.capital); // 県庁所在地
		System.out.println("面積：" + this.area + "km2"); // 面積
		System.out.println();
	}



}