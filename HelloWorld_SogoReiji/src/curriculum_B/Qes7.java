package curriculum_B;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*-----------------------------------------------
		 7.生徒の成績管理プログラム作成
		-----------------------------------------------*/
		
		// Scannerクラス
		Scanner scanner = new Scanner(System.in);
		// 生徒数を格納する変数の宣言
		int count;
		
		// do-while文を使用して生徒数の入力を2人以上に指定
		do {
		// 「生徒の人数を入力してください（2以上）:」とコンソール出力
			System.out.print("生徒の人数を入力してください（2以上）:");
		// 入力された生徒数を変数に代入
			count = scanner.nextInt();
		}while(count < 2);
		
		// 点数を格納する2次元配列の宣言
		int [][] scores = new int [count][4];
		
		// for文を使用してN人の生徒の成績を科目ごとに入出力
		for(int i = 0; i < count; i++) {
		// 「N人目の『英語』の点数を入力してください：」とコンソール出力
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");
		// 英語の点数を配列に代入
			scores[i][0] = scanner.nextInt();
		// 「N人目の『数学』の点数を入力してください：」とコンソール出力
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");
		// 数学の点数を配列に代入
			scores[i][1] = scanner.nextInt();
		// 「N人目の『理科』の点数を入力してください：」とコンソール出力
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");
		// 理科の点数を配列に代入
			scores[i][2] = scanner.nextInt();
		// 「N人目の『社会』の点数を入力してください：」とコンソール出力
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");
		// 社会の点数を配列に代入
			scores[i][3] = scanner.nextInt();
			System.out.println();
		};
		
		// for文を使用して各生徒の平均点を出力
		for(int i =0; i < count; i++) {
		// 合計点を計算し、変数に代入
			double sum = scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3];
		// 平均点を計算し、変数に代入
			double avg = sum / 4;
		// 平均点を小数第3位で四捨五入
			BigDecimal avgRound = new BigDecimal(avg).setScale(2,RoundingMode.HALF_UP);
		// 「N人目の平均点は(avg)点です」とコンソール出力
			System.out.printf("%d人目の平均点は%.2f点です。\n",i + 1, avgRound.doubleValue());
		};
		System.out.println();
		
		// 各教科と全体の合計点を格納する変数の宣言および初期化
		// 英語
		double englishSum = 0;
		// 数学
		double mathSum = 0;
		// 理科
		double scienceSum = 0;
		// 社会
		double socialSum = 0;
		// 全体
		double allSum = 0;
		
		// for文を使用して各教科と全体の平均点を計算し、変数に自己代入
		for(int i =0; i < count; i++) {
		// 英語
			englishSum += scores[i][0];
		// 数学
			mathSum += scores[i][1];
		// 理科
			scienceSum += scores[i][2];
		// 社会
			socialSum += scores[i][3];
		// 全体
			allSum += scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3];
		};
		
		// 英語の平均点計算
		double englishAvg = englishSum / count;
		// 英語の平均点を四捨五入
		BigDecimal englishAvgRound = new BigDecimal(englishAvg).setScale(2,RoundingMode.HALF_UP);
		// 「英語の平均点は(englishAvgRound)点です。とコンソール出力
		System.out.printf("英語の平均点は%.2f点です。\n", englishAvgRound.doubleValue());
		// 数学の平均点計算
		double mathAvg = mathSum / count;
		// 数学の平均点を四捨五入
		BigDecimal mathAvgRound = new BigDecimal(mathAvg).setScale(2,RoundingMode.HALF_UP);
		// 「数学の平均点は(mathAvgRound)点です。とコンソール出力
		System.out.printf("数学の平均点は%.2f点です。\n", mathAvgRound.doubleValue());
		// 理科の平均点計算
		double scienceAvg = scienceSum / count;
		// 理科の平均点を四捨五入
		BigDecimal scienceAvgRound = new BigDecimal(scienceAvg).setScale(2,RoundingMode.HALF_UP);
		// 「理科の平均点は(scienceAvgRound)点です。とコンソール出力
		System.out.printf("理科の平均点は%.2f点です。\n", scienceAvgRound.doubleValue());
		// 社会の平均点計算
		double socialAvg = socialSum / count;
		// 社会の平均点を四捨五入
		BigDecimal socialAvgRound = new BigDecimal(socialAvg).setScale(2,RoundingMode.HALF_UP);
		// 「社会の平均点は(socialAvgRound)点です。とコンソール出力
		System.out.printf("社会の平均点は%.2f点です。\n", socialAvgRound.doubleValue());
		// 全体の平均点計算
		double allAvg = allSum / (count * 4);
		// 全体の平均点を四捨五入
		BigDecimal allAvgRound = new BigDecimal(allAvg).setScale(2,RoundingMode.HALF_UP);
		// 「全体の平均点は(allAvgRound)点です。とコンソール出力
		System.out.printf("全体の平均点は%.2f点です。\n", allAvgRound.doubleValue());
		
		scanner.close();
		
		
	}

}
