package sample.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sample.common.dao.entity.Login;
import sample.common.dao.mapper.LoginMapper;

// 未使用
@Repository
public class LoginDao {
	
	@Autowired
	private LoginMapper loginMapper;
	
	
	// ユーザ登録
	public void insertLogin(Login login) {
		loginMapper.insertLogin(login);
	}
	
	
	// ユーザ名＋パスワードで検索
	public Login findByUsernameAndPassword(String username, String password) {
		return loginMapper.selectByUsernameAndPassword(username, password);
	}
}
