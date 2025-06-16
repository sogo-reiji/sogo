package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*----------------------------------------------------------------------------------
		 Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		----------------------------------------------------------------------------------*/
		
		// Dogクラス（動物の名前）のインスタンス生成
		Dog dog1 = new Dog();
		// 動物の名前をコンソール出力
		System.out.println(dog1.animalName);
		
		/*----------------------------------------------------------------------------------
		 Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		----------------------------------------------------------------------------------*/
		
		// Dogクラス（動物の数）のインスタンス生成
		Dog dog2 = new Dog(2);
		// 動物の数をコンソール出力
		System.out.println(dog2.animalCount);
		
		/*----------------------------------------------------------------------------------
		 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		----------------------------------------------------------------------------------*/
		
		// LocalDateTimeクラスで現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 日時のフォーマットを「yyyy-MM-dd H:m:s」形式に整形
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// フォーマットした日時を変数に代入
        String formattedDateTime = now.format(formatter);
		// 現在日時をコンソール出力
        System.out.println(formattedDateTime);
	}

}
