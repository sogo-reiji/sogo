package sample.common.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.common.dao.entity.Task;
import sample.common.dao.mapper.TaskMapper;
import sample.common.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	private final TaskMapper taskMapper;
	
	
	public TaskServiceImpl(TaskMapper taskMapper) {
		this.taskMapper = taskMapper;
	}
	
	
	// ページング対応タスク一覧取得
	@Override
	public List<Task> getTasksPaged(
		String username,
		int page,
		int size
	){
		int offset = (page - 1) * size;
		return taskMapper.findPagedByUsername(username,size,offset);
	}
	
	
	// タスク総件数の取得
	@Override
	public int getTaskCount(String username) {
		return taskMapper.countAllByUsername(username);
	}
	
	
	// 単一タスクの取得(ID指定)
	@Override
	public Task getTaskById(Long id, String username) {
		Task task = taskMapper.findById(id);
		return (task != null && task.getUsername().equals(username))? task : null;
	}
	
	
	// タスクの新規登録
	@Transactional
	@Override
	public void insertTask(Task task) {
		taskMapper.insertTask(task);
	}
	
	
	// タスクの更新
	@Transactional
	@Override
	public void updateTask(Task task, String username) {
		taskMapper.update(task, username);
	}
	
	
	// タスクの削除
	@Transactional
	@Override
	public void deleteTask(Long id, String username) {
		taskMapper.delete(id, username);
	}
	
	
}
