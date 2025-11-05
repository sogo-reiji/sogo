package sample.common.service;

import sample.common.dao.entity.User;

public interface LoginService {
	
	// ユーザー登録メソッド
	void register(String username, String password);
	
	
	// ログインメソッド
	User login(String username, String password);
	
	
	/*
	// ログインメソッド(修正前)
	Login login(String username, String password);
	*/
	
}
