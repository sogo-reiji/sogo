package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*----------------------------------------------------------------------------------------
		 1.入力チェックシステム作成
		 2.ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
		----------------------------------------------------------------------------------------*/
		
		// Scannerクラス
		Scanner scanner = new Scanner(System.in);
		
		// Scannerクラスを使ってコンソールにユーザー名を入力できるように処理
		String userName = scanner.nextLine();
		
		// ifの条件設定：ユーザー名の文字数が10文字より大きい…①
		if( userName.length() > 10 ) {
		// ①を満たす場合の処理：「名前を10文字以内にしてください」と出力
			System.out.println( "「名前を10文字以内にしてください」" );
		// else ifの条件設定：ユーザー名の文字数が0文字以下もしくはnull…②
		} else if( userName.length() <= 0 || userName == null ){
		// ①を満たさず、②を満たす場合の処理：「名前を入力してください」と出力
			System.out.println( "「名前を入力してください」" );
		// else ifの条件設定：ユーザー名が半角英数字以外…③
		} else if( userName.matches( "^[A-Za-z0-9]+$" ) == false ){	
		// ①,②を満たさず、③を満たす場合の処理：「半角英数字のみで名前を入力してください」と出力
			System.out.println( "「半角英数字のみで名前を入力してください」" );
		// ①,②,③のどれも満たさない場合の処理：ユーザー名「 入力したユーザー名 」を登録しましたと出力
		} else {
			System.out.println( "ユーザー名「" + userName + "」を登録しました" );
		}
		
		
		/*---------------------------
		 3.じゃんけんシステム作成
		---------------------------*/
		
		// String型の配列変数jankenの宣言
		String[] janken = new String[3];
		// 要素[0]にグーを代入
		janken[0] = "グー";
		// 要素[1]にチョキを代入
		janken[1] = "チョキ";
		// 要素[2]にパーを代入
		janken[2] = "パー";
		
		// Scannerクラスを使ってコンソールにユーザー名を入力できるように処理
		userName = scanner.nextLine();
		
		// if文の条件設定：ユーザー名が正常の場合、じゃんけんシステムが起動
		if( (userName.length() < 10) && (userName.length() >= 0) && (userName != null) && (userName.matches( "^[A-Za-z0-9]+$" ) == true) ) {
		// for文の繰り返し条件の設定
			for(int i = 1; i < 100; i++ ) {
		// 自分の手の乱数生成
				int me = new java.util.Random().nextInt(3);
		// 相手の手の乱数生成
				int opponent = new java.util.Random().nextInt(3);
		// for文の処理；ユーザー名「 userName 」を登録しましたと出力
				System.out.println( "ユーザー名「" + userName + "」を登録しました" );
		// for文の処理；「 userName 」の手は「janken[me]」と出力
				System.out.println( userName + "の手は「" + janken[me] + "」" );
		// for文の処理；相手の手は「janken[opponent]」と出力
				System.out.println( "相手の手は「" + janken[opponent] + "」" );
				System.out.println();
		// if文の条件設定：あいこの場合
				if( me == opponent ) {
		// あいこの場合の処理：DRAW あいこ もう一回しましょう！と出力
					System.out.println("DRAW あいこ もう一回しましょう！");
					System.out.println();
		// else if文の条件設定：グーに負けた場合
				} else if( me == 1 && opponent == 0 ){
		// グーに負けた場合の処理：俺の勝ち！　負けは次につながるチャンスです！　ネバーギブアップ！と出力
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
					System.out.println();
		// else if文の条件設定：チョキに負けた場合
				} else if( me == 2 && opponent == 1 ){
		// チョキに負けた場合の処理：俺の勝ち！　たかがじゃんけん、そう思ってないですか？　それやったら次も、俺が勝ちますよと出力
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
					System.out.println();
		// else if文の条件設定：パーに負けた場合
				} else if( me == 0 && opponent == 2 ){
		// パーに負けた場合の処理：俺の勝ち！　なんで負けたか、明日まで考えといてください。　そしたら何かが見えてくるはずですと出力
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
					System.out.println();
		// else文：勝った場合
				} else {
		// 勝った場合の処理：やるやん。　次は俺にリベンジさせてと出力
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
		// ループ変数iを用いてじゃんけんを行った回数を出力
					System.out.println("勝つまでにかかった合計回数は" + i + "回です");
		// break文でループ処理を中断
					break;
				}	
			}
		}
		
		scanner.close();
		
		
	}

}
