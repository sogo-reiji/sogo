package sample.common.dao.entity;

import java.time.LocalDateTime;

/*
 * usersテーブルの1件のデータを表すEntity
 */
public class User {
	
	private long id; // ユーザーID（PK）
	private String username; // ユーザー名
	// private byte[] password;
	private String password; // パスワード（ハッシュ化済み）
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
	
	
	// public byte[] getPassword() {
	public String getPassword() {
		return password;
	}
	
	
	// public void setPassword(byte[] password) {
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
