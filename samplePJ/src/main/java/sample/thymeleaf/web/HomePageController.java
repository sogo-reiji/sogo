package sample.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	// TOP画面表示
	@GetMapping("/")
	public String home() {
		return "homePage";
	}
	
}
