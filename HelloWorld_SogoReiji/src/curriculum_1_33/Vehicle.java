package curriculum_1_33;

public class Vehicle {
	/*--------------------------------------------------
	 問題1：インスタンスフィールドに「owner」を追加
	--------------------------------------------------*/
	private String owner;
	
	/*--------------------------------------------------
	 問題3：ownerフィールドのgetterとsetterを定義
	--------------------------------------------------*/
	// getterメソッド（問題3）
	public String getOwner() {
		return this.owner;
	}
	
	// setterメソッド（問題3）
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
