package sample.common.logic;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

/*
 * ログインチェック用インターセプター
 */


public class LoginInterceptor implements HandlerInterceptor {
	
	// ログインチェック
	@Override
	public boolean preHandle(
		HttpServletRequest request,
		HttpServletResponse response,
		Object handler
	) throws Exception {
		HttpSession session = request.getSession(false);
		
		if(session == null || session.getAttribute("loginUser") == null) {
			response.sendRedirect("/login");
			return false;
		}
		return true;
	}
	
	
	/*
	// ログインチェック(修正前)
	@Override
	public boolean preHandle(
		HttpServletRequest request,
		HttpServletResponse response,
		Object handler
	) throws Exception {
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("login") == null) {
			response.sendRedirect("/login");
			return false;
		}
		return true;
	}
	*/
}
