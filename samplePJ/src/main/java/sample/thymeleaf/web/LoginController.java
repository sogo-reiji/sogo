package sample.thymeleaf.web;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sample.common.dao.entity.User;
import sample.common.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	// ユーザ登録画面表示
	@GetMapping("/register")
	public String showRegisterForm() {
		return "register";
	}
	
	
	// ユーザ登録処理
	@PostMapping("/register")
	public String register(
		@RequestParam("username") String username,
		@RequestParam("password") String password
	) {
		loginService.register(username,password);
		return "redirect:/login"; // "redirect:" : 登録後、ログイン画面へリダイレクト
	}
	
	
	// ログイン画面表示
	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	
	// ログイン処理
	@PostMapping("/login")
	public String login(
		@RequestParam("username") String username,
		@RequestParam("password") String password,
		HttpSession session
	) {
		User user = loginService.login(username, password);
		// ログイン失敗時の処理
		if (user == null) {
			// エラーメッセージ付きでログイン画面に戻す
			session.setAttribute("loginError", "ユーザー名またはパスワードが正しくありません。");
			return "redirect:/login";
		}

		// ログイン成功時 → セッションにユーザー情報を保持
		session.setAttribute("loginUser", user);
		session.setMaxInactiveInterval(86400); // セッション有効期限 1日（秒）

		return "redirect:/tasks";
	}
	
	
	// ログアウト
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	
	/*
	// ログイン処理(修正前)
	@PostMapping("/login")
	public String login(
		@RequestParam("username") String username,
		@RequestParam("password") String password,
		HttpSession session
	) {
		Login login = loginService.login(username, password);
		session.setAttribute("login", login);
		session.setMaxInactiveInterval(86400); // 1日
		return "redirect:/tasks";
	}
	*/
	
}
