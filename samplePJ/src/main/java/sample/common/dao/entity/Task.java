package sample.common.dao.entity;

import java.time.LocalDate;

/*
 * tasksテーブルの1件のデータを表すEntity
 */
public class Task {
	
	private String username; // ログインユーザー名追加
	private long id; // タスクID（PK）
	private String title; // タイトル
	private String content; // 内容
	private String name; // 登録者名
	private LocalDate startDate; // 開始日
	private LocalDate endDate; // 終了日
	private LocalDate createdAt; // 作成日時
	private LocalDate updatedAt; // 更新日時
	
	
	// --- Getter & Setter ---
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
