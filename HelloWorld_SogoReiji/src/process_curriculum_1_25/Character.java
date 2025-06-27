package process_curriculum_1_25;

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

// スーパークラスの定義 
public class Character{
	
	// 各ステータスのフィールド宣言
	private int hp; // HP
	private int mp; // MP
	private int attack; // 攻撃力
	private int speed; // 素早さ
	private int defense; // 防御力

	// コンストラクタの定義
	public Character(int hp, int mp, int attack, int speed, int defense){
		// 引数の値をsetHPに渡す
		setHp(hp);
        // 引数の値でmpフィールドを初期化
        this.mp = mp;
        // 引数の値でattackフィールドを初期化
        this.attack = attack;
        // 引数の値でspeedフィールドを初期化
        this.speed = speed;
        // 引数の値でdefenseフィールドを初期化
        this.defense = defense;
    }
	
	// getterメソッドでHPの値を呼び出し元に返す
    public int getHp(){
        return this.hp;
    }
    
    // getterメソッドでMPの値を呼び出し元に返す
    public int getMp(){
        return this.mp;
    }

    // getterメソッドで攻撃力の値を呼び出し元に返す
    public int getAttack(){
        return this.attack;
    }

    // getterメソッドで素早さの値を呼び出し元に返す
    public int getSpeed(){
        return this.speed;
    }

	// getterメソッドで防御力の値を呼び出し元に返す
    public int getDefense(){
        return this.defense;
    }
	
    // セッターでHPの値を変更可能に
    public void setHp(int hp) {
    	// HPの乱数が0で生成された場合、HPを1にしてhpフィールドに代入
        if (hp < 1) {
            this.hp = 1;
        // HPの乱数が1以上で生成された場合、その値をhpフィールドに代入
        } else {
            this.hp = hp;
        }
    }

    // セッターでMPの値を変更可能に
    public void setMp(int mp){
        this.mp = mp;
    }

    // セッターで攻撃力の値を変更可能に
    public void setAttack(int attack){
        this.attack = attack;
    }

    // セッターで素早さの値を変更可能に
    public void setSpeed(int speed){
        this.speed = speed;
    }

    // セッターで防御力の値を変更可能に
    public void setDefense(int defense){
        this.defense = defense;
    }
    
    
}
