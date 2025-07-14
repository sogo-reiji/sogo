package curriculum_1_31;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎",20,1.7,60);
		person1.print();
		Person person2 = new Person("山田花子",22,1.5,40);
		person2.print();
		
		/*------------------------------------------------------------
		 問題3：System.out.printlnを使い「合計〇〇人です」と出力
		------------------------------------------------------------*/
		System.out.println("合計" + Person.getCount() + "人です");
		
		/*-----------------------------------------------------------------
		 問題6：クラスメソッド「printCount」を呼び出し
		-----------------------------------------------------------------*/
		Person.printCount();
	}

}
