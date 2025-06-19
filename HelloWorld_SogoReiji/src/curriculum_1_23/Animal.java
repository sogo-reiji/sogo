package curriculum_1_23;

public class Animal {

/*-------------------------------------------------------
 	下記がコンソールに出力されるように作成
 	※thisとsetterとgetterとフィールドを使用
 
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
-------------------------------------------------------*/
	
	// 動物名の変数を宣言（カプセル化）
	private String animalName;
	// 体長の変数を宣言（カプセル化）
	private double bodyLength;
	// 速度の変数を宣言（カプセル化）
	private int velocity;
	
	public String getAnimalName() {
		// ゲッターでメンバ変数から動物名の値を取得
		return animalName;
	}
	
	public double getBodyLength() {
		// ゲッターでメンバ変数から体長の値を取得
		return bodyLength;
	}
	
	public int getVelocity() {
		// ゲッターでメンバ変数から速度の値を取得
		return velocity;
	}
	
	public void setAnimalName(String animalName) {
		// セッターで動物名のメンバ変数の値を変更
		this.animalName = animalName;
	}
	
	public void setBodyLength(double bodyLength) {
		// セッターで体長のメンバ変数の値を変更
		this.bodyLength = bodyLength;
	}
	
	public void setVelocity(int velocity) {
		// セッターで速度のメンバ変数の値を変更
		this.velocity = velocity;
	}
	
	public void printAnimal(){
		// 動物名をコンソール出力 + nullチェック
		if (this.animalName != null) {
			System.out.println("動物名：" + this.animalName);
		} else {
			System.out.println("動物名：未設定");
		}
		// 体長をコンソール出力
		System.out.println("体長：" + this.bodyLength + "m");
		// 速度をコンソール出力
		System.out.println("速度：" + this.velocity + "km/h");
	}
	
}
