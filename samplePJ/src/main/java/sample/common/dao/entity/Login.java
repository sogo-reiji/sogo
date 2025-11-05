package sample.common.dao.entity;

import java.time.LocalDateTime;

/*
 * loginテーブルの1件のデータを表すEntity（未使用）
 */

public class Login {
	
	private long id; // ユーザID（PK）
	private String username; // ユーザ名（半角英字）
	private String password; // パスワード（ハッシュ化）
	private LocalDateTime createdAt; // 登録日時
	private LocalDateTime updatedAt; // 更新日時
	
	
	// --- Getter & Setter ---	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
