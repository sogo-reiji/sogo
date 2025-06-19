package process_Curriculum_1_20_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Japan {

	// あいさつの変数を宣言
	String greeting;
	// 寿司コメントの変数を宣言
	String foodComment;
	// 料理のジャンルの変数を宣言
	String foodType;
	// 現在日時の変数を宣言
	String dateTime;
	
	public void PrintJapan(){
	
		// 変数greetingにあいさつ文を代入
		this.greeting = "こんにちは！ここは日本です";
		// 変数greetingをコンソール出力
		System.out.println(this.greeting);
		// 変数foodCommentに寿司コメントを代入
		this.foodComment= "この寿司はうまい";
		// 変数foodCommentをコンソール出力
		System.out.println(this.foodComment);
		// 変数foodTypeに料理のジャンルを代入
		this.foodType = "寿司は和食です";
		// 変数foodTypeをコンソール出力
		System.out.println(this.foodType);
		
		// LocalDateTimeクラスで現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		// 日時のフォーマットを「yyyy/MM/dd HH:mm:ss」形式に整形
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		// フォーマットした日時を変数に代入
        this.dateTime = now.format(formatter);
        // 現在日時をコンソール出力
        System.out.println("今の現在日時は" + this.dateTime + "です");
		
	}
	
}
