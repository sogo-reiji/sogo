package curriculum_B;

import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		/*-----------------------------------------------
		 6.商品の残り台数が出力されるシステム作成
		-----------------------------------------------*/
		
		// Scannerクラス
		Scanner scanner = new Scanner(System.in);
		
		// Scannerクラスを使ってコンソールに商品名を入力できるように処理
		String input = scanner.nextLine();
		// コンソール入力値をString配列に代入（splitを使い区切り文字で分割指定）
		String[] products = input.split("、");
		
		// 最大個数11個の乱数を生成し、テレビ在庫の変数に代入
		int tvStock =  new java.util.Random().nextInt(12);
		// 最大個数11個からテレビ在庫を引いた値をディスプレイ在庫の変数に代入
		int displayStock = 11 - tvStock;
		
		// 拡張for文で配列を一つずつ処理
		for (String product : products) {
		// 最大個数11個の乱数を生成し、在庫の変数に代入
			int stock = new java.util.Random().nextInt(12);
		// switch文で各商品の処理設定
			switch (product) {
		// パソコン、冷蔵庫、扇風機、洗濯機、加湿器のいずれかが入力された場合
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
		// 「(product)の残り台数は(stock)です」とコンソール出力
					System.out.println(product + "の残り台数は" + stock + "台です" + "\n\n");
					break;
		// テレビ、ディスプレイのいずれかが入力された場合
				case "テレビ":
				case "ディスプレイ":
		// 条件演算子でテレビが入力された場合とディスプレイが入力された場合で条件分岐
		// テレビが入力された場合の処理：テレビの残り台数は(tvStock)台ですとコンソール出力
		// ディスプレイが入力された場合の処理：ディスプレイの残り台数は(displayStock)台ですとコンソール出力
					System.out.println(product.equals("テレビ") ? "テレビの残り台数は" + tvStock + "台です" + "\n\n" : "ディスプレイの残り台数は" + displayStock + "台です" + "\n\n");
					break;
		// case全てに一致しない場合
				default:
		// 「『(product)』は指定の商品ではありません」とコンソール出力
					System.out.println("『" + product + "』は指定の商品ではありません" + "\n\n");
					break;
			}
		 }
		
		scanner.close();
	
	
	}

}