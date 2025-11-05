package sample.common.service.impl;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.common.dao.entity.User;
import sample.common.dao.mapper.UserMapper;
import sample.common.logic.LoginLogic;
import sample.common.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	/*
	// 未使用
	@Autowired
	private LoginDao loginDao;
	*/
	
	@Autowired
	private LoginLogic loginLogic;

	@Autowired
	private UserMapper userMapper;
	
	
	// ユーザー登録処理
	@Override
	public void register(String username, String password) {
		try {
			// パスワードをハッシュ化(バイト配列)
			byte[] hashedBytes = loginLogic.passwordHashing(password);
			
			// 16進文字列へ変換
			String hashedPassword = bytesToHex(hashedBytes);

			// Userエンティティを作成、ユーザ情報の登録
			User user = new User();
			user.setUsername(username);
			user.setPassword(hashedPassword);
			user.setCreatedAt(LocalDateTime.now());
			user.setUpdatedAt(LocalDateTime.now());

			// DB登録
			userMapper.insertUser(user);

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("パスワードハッシュ化に失敗しました", e);
		}
	}
	
	
	// ログイン処理
	@Override
	public User login(String username, String password) {
		try {
			// パスワードをハッシュ化(バイト配列)
			byte[] hashedBytes = loginLogic.passwordHashing(password);
			
			// 16進文字列へ変換
			String hashedPassword = bytesToHex(hashedBytes);
			
			// DB検索
			User user = loginLogic.getLoginUser(username, hashedPassword);
			
			// 該当ユーザーが存在しなければnull
			return user;
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("ログイン処理中にハッシュ化に失敗しました", e);
		}
	}
	
	
	// 	byte[]→String変換メソッド
	private String bytesToHex(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for(byte b : bytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}
	
	
	/*
	// ユーザー登録処理（修正前）
	@Override
	public void register(String username, String password) {
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		login.setCreatedAt(LocalDateTime.now());
		login.setUpdatedAt(LocalDateTime.now());
		loginDao.insertLogin(login);
	}
	*/
	
	
	/*
	// ログイン処理(修正前)
	@Override
	public Login login(String username, String password) {
		return loginDao.findByUsernameAndPassword(username, password);
	}
	*/
}
