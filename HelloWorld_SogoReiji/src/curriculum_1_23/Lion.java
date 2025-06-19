package curriculum_1_23;

public class Lion {
	
/*-------------------------------------------------------
 	下記がコンソールに出力されるように作成
 	※thisとsetterとgetterとフィールドを使用
 
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
-------------------------------------------------------*/

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Animalクラスのインスタンス生成
		Animal lion = new Animal();

        // セッターで動物の名前の値を引数に渡す
        lion.setAnimalName("ライオン");
        // セッターで体長の値を引数に渡す
        lion.setBodyLength(2.1);
        // セッターで速度の値を引数に渡す
        lion.setVelocity(80);

        // PrintAnimalメソッドの呼び出し
        lion.printAnimal();
		
		
	}

}
