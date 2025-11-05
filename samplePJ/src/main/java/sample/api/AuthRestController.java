package sample.api;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.common.dao.entity.User;
import sample.common.service.LoginService;

@RestController
@RequestMapping("/api/auth")
public class AuthRestController {
	
	private final LoginService loginService;
	
	
	public AuthRestController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	// ログイン
		@PostMapping("/login")
		public void login(
			@RequestParam String username,
			@RequestParam String password,
			HttpSession session
		) {
			User user = loginService.login(username, password);
			session.setAttribute("loginUser", user);
			session.setMaxInactiveInterval(86400); // 1日
		}
	
	
	// ログアウト
	@PostMapping("/logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
	
	/*
	// ログイン(修正前)
	@PostMapping("/login")
	public void login(
		@RequestParam String username,
		@RequestParam String password,
		HttpSession session
	) {
		Login login = loginService.login(username, password);
		session.setAttribute("login", login);
		session.setMaxInactiveInterval(86400); // 1日
	}
	*/
	
}
