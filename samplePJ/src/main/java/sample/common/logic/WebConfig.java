package sample.common.logic;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * Web設定クラス(リクエストのインターセプト)
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
		.addPathPatterns("/tasks/**") // tasks配下はログイン必須
		.excludePathPatterns("/login","/register","/","/css/**","/js/**"); // 除外
	}
}
