package sample.common.service;

import java.util.List;

import sample.common.dao.entity.Task;

public interface TaskService {
	
	// ページング対応タスク一覧取得
	List<Task> getTasksPaged(String username, int page, int size);
	
	// タスク総件数の取得
	int getTaskCount(String username);
	
	// 単一タスクの取得(ID指定)
	Task getTaskById(Long id, String username);
	
	// タスクの新規登録
	void insertTask(Task task);
	
	// タスクの更新
	void updateTask(Task task,String username);
	
	// タスクの削除
	void deleteTask(Long id, String username);
}
