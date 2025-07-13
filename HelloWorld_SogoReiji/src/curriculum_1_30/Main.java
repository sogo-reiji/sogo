package curriculum_1_30;

public class Main {

	public static void main(String[] args) {
		/*------------------------------
		 問題5：引数にweightの60を追加
		------------------------------*/
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		person1.print();
		
		/*-----------------------------------------------------------
		 問題10：人数の合計を「合計〇人です」とコンソール出力
		-----------------------------------------------------------*/
		System.out.println("合計" + Person.getCount() + "人です");

	}

}
