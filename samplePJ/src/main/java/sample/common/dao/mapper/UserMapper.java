package sample.common.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import  sample.common.dao.entity.User;

@Mapper
public interface UserMapper {
	
	// ユーザー登録
	void insertUser(User user);
	
	// ユーザー検索
	User userSearch(User user);
}
