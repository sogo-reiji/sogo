package sample.common.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import sample.common.dao.entity.Task;

@Mapper
public interface TaskMapper {
	
	// ページング付き一覧取得
	List<Task> findPagedByUsername(
		@Param("username") String username,
		@Param("size") int size,
		@Param("offset") int offset
	);
	
	
	// 件数カウント
	int countAllByUsername(@Param("username") String username);
	
	
	// ID指定で1件取得
	Task findById(@Param("id") Long id);
	
	
	// データ追加
	void insertTask(Task task);
	
	
	// データ更新
	void update(
		@Param("task") Task task,
		@Param("username") String username
	);
	
	
	// データ削除
	void delete(
		@Param("id") Long id,
		@Param("username") String username
	);
}
