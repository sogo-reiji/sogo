package main_curriculum_1_29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import process_curriculum_1_29.Prefecture;

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

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Prefecture型配列のインスタンス生成
		Prefecture[] prefectures = new Prefecture[11];
		
		// 各要素にインスタンスを代入
		prefectures[0] = new Prefecture("北海道","札幌市",83424); // 北海道
		prefectures[1] = new Prefecture("青森県","青森市",9646); // 青森県
		prefectures[2] = new Prefecture("岩手県","盛岡市",15275); // 岩手県
		prefectures[3] = new Prefecture("宮城県","仙台市",7282); // 宮城県
		prefectures[4] = new Prefecture("秋田県","秋田市",11638); // 秋田県
		prefectures[5] = new Prefecture("山形県","山形市",9323); // 山形県
		prefectures[6] = new Prefecture("福島県","福島市",13784); // 福島県
		prefectures[7] = new Prefecture("茨城県","水戸市",6097); // 茨城県
		prefectures[8] = new Prefecture("栃木県","宇都宮市",6408); // 栃木県
		prefectures[9] = new Prefecture("群馬県","前橋市",6362); // 群馬県
		prefectures[10] = new Prefecture("埼玉県","さいたま市",3798); // 埼玉県
		
		// Scannerクラスのインスタンス生成
		Scanner sc = new Scanner(System.in);
		
		// "番号を入力してください"と出力
		System.out.println("番号を入力してください");
		// 入力された番号をsplitメソッドで分割し、配列に格納
		String[] inputNum = sc.nextLine().split(",");
		
		// "昇順なら1、降順なら2を入力してください"と出力
		System.out.println("昇順なら1、降順なら2を入力してください");
		// 入力された番号をsort変数に代入
		int sort =sc.nextInt();
		System.out.println();
		
		// Prefecture型のリストを生成
		List<Prefecture> selectPref = new ArrayList<>();
		
		// 拡張for文でinputNum配列を回す
		for(String indexNum : inputNum) {
			// 入力された番号をString型からint型に型変換
			int index = Integer.parseInt(indexNum);
			// 番号に該当する都道府県データをselectPrefリストに追加
			selectPref.add(prefectures[index]);
		}
		
		// Comparatorを使用してselectPrefリストの並び順を面積の昇順に定義
		Comparator<Prefecture> comparator = Comparator.comparingDouble(Prefecture::getArea);
		// if文を使用して入力値が2(降順)だった場合、並び順を降順に変更
		if(sort == 2) {
			comparator = comparator.reversed();
		}
		// selectPrefリストをcomparatorで定義した並び順にソート
		selectPref.sort(comparator);
		
		// 拡張for文でselectPrefリストを回す
		for(Prefecture p : selectPref) {
			// printInfoメソッドの呼び出し
			p.printInfo();
		}
		
	}

}
