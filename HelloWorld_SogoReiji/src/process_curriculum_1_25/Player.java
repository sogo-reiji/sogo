package process_curriculum_1_25;

import java.util.Random;

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

// Characterクラスを継承してサブクラスのPlayerクラスを定義 
public class Player extends Character{
	
	// 名前のフィールドを追加
    private String name;
    
    // 乱数を生成するstatusメソッドの定義
    public static int status(){
    	// Randomクラスのインスタンス生成
        Random rand = new Random();
        // 0～999までの乱数を生成し戻す
        return rand.nextInt(1000);
    }

    // Playerコンストラクタの定義
    public Player(String name){
    	// スーパークラスのコンストラクタの呼び出し（引数に乱数を渡す）
        super(status(), status(), status(), status(), status());
        // 引数の値でnameフィールドを初期化
        this.name = name;
    }

    // getterメソッドで名前の値を呼び出し元に返す
    public String getName(){
        return name;
    }

    // セッターで名前の値を変更可能に
    public void setName(String name){
        this.name = name;
    }
}
