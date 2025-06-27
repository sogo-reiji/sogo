package main_curriculum_1_25;

import java.util.Scanner;

import process_curriculum_1_25.Player;

/*-----------------------------------------------------------------
	名前を入力したら下記がコンソールに出力されるプログラム
	　条件：数値は毎回変わるように作成
	　サブクラスを使用
	　スーパークラスを使用
	　getterとsetterを使用
	　packageを2つ作ってメインと処理に分ける
	　命名する場合は規則にのっとって命名
	　コンストラクタを使用

	以下、出力例
	　こんにちは 「 名前 」 さん
	　ステータス
	　HP：849
	　MP：862
	　攻撃力：375
	　素早さ：937
	　防御力：24

	　さあ冒険に出かけよう！
-----------------------------------------------------------------*/

public class Main{

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		
		// Scannerクラスのインスタンス生成
		Scanner scanner = new Scanner(System.in);
		// 名前用の変数宣言
		String name;
		
		// 入力値のnullチェック
		while (true){
			System.out.print("名前を入力してください: ");
			// 名前のコンソール入力
			name = scanner.nextLine();
			// 入力値が正常の場合、ループを抜ける
			if(name != null){
				break;
			// 入力値がnullの場合、もう一度コンソール入力
			} else{
				System.out.println("入力された名前がnullです。もう一度入力してください。");
			}
		}
		
		// Playerクラスのコンストラクタの呼び出し
		Player player = new Player(name);
		System.out.println();
		
		// 名前や各ステータスのコンソール出力
        System.out.println("こんにちは 「" + player.getName() + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + player.getHp());
        System.out.println("MP：" + player.getMp());
        System.out.println("攻撃力：" + player.getAttack());
        System.out.println("素早さ：" + player.getSpeed());
        System.out.println("防御力：" + player.getDefense());
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");
		
		
	}

}
