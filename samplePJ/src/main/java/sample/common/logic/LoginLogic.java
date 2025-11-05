package sample.common.logic;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sample.common.dao.entity.User;
import sample.common.dao.mapper.UserMapper;

@Component
public class LoginLogic {
	
	// ハッシュアルゴリズム名の注入
	@Value("${password.hash.code}")
	private String hashCode;
	
	
	@Autowired
	private UserMapper userMapper;
	
	
	// パスワードハッシュ化処理
	public byte[] passwordHashing(String password) throws NoSuchAlgorithmException {
		
		MessageDigest md = MessageDigest.getInstance(hashCode);
		byte[] passHash = md.digest(password.getBytes(StandardCharsets.UTF_8));
		
		return passHash;
	}
	
	
	// DB検索
	public User getLoginUser(String username,String hashedPassword) {
		User searchUser = new User();
		searchUser.setUsername(username); // setEmail_addressから修正（メールアドレス入力フォームがないため）
		searchUser.setPassword(hashedPassword);
		return userMapper.userSearch(searchUser);
	}
	
}
