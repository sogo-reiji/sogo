package sample.thymeleaf.web;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sample.common.dao.entity.Task;
import sample.common.dao.entity.User;
import sample.common.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	
	// タスク一覧表示
	@GetMapping
	public String list(
		@RequestParam(defaultValue = "1") int page, // ページ番号
		Model model,
		HttpSession session
	) {
		String username = getUsername(session);
		// ページング処理
		int pageSize = 10; // 1ページあたり10件
		var tasks = taskService.getTasksPaged(username,page,pageSize); // 該当タスクデータの取得
		int totalTasks = taskService.getTaskCount(username); // タスク総件数の取得
		int totalPages = (int) Math.ceil((double) totalTasks / pageSize); // 総ページ数の計算
		
		model.addAttribute("tasks", tasks);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", totalPages);
		return "tasks/list";
	}
	
	
	// タスク新規登録画面表示
	@GetMapping("/new")
	public String showNewForm(Model model) {
		model.addAttribute("task", new Task());
		return "tasks/form-new";
	}
	
	
	// タスク新規登録処理
	@PostMapping
	public String createTask(
		@ModelAttribute Task task,
		HttpSession session
	) {
		String username = getUsername(session);
		task.setUsername(username); // ログインユーザーの名前をセット
		taskService.insertTask(task);
		return "redirect:/tasks";
	}
	
	
	// タスク編集画面表示
	@GetMapping("/edit/{id}")
	public String showEditForm(
		@PathVariable Long id,
		Model model,
		HttpSession session
	) {
		String username = getUsername(session);
		Task task = taskService.getTaskById(id, username);
		if(task == null) {
			return "redirect:/tasks"; // 他人のタスクならリダイレクト
		}
		model.addAttribute("task", task);
		return "tasks/form-edit";
	}
	
	
	// タスク編集処理
	@PostMapping("/update/{id}")
	public String updateTask(
		@PathVariable Long id,
		@ModelAttribute Task task,
		HttpSession session
	) {
		String username = getUsername(session);
		task.setId(id);
		task.setUsername(username);
		taskService.updateTask(task, username);
		return "redirect:/tasks";
		
	}
	
	
	// タスク削除処理
	@PostMapping("/delete/{id}")
	public String deleteTask(
		@PathVariable Long id,
		HttpSession session
	) {
		String username = getUsername(session);
		taskService.deleteTask(id, username);
		return "redirect:/tasks";
	}
	
	
	// ユーザー名取得
	private String getUsername(HttpSession session) {
		User loginUser = (User) session.getAttribute("loginUser");
		return loginUser.getUsername();
		
	}
	
	
	/*
	// ユーザー名取得(修正前)
	private String getUsername(HttpSession session) {
		Login login = (Login) session.getAttribute("login");
		return login.getUsername();
		
	}
	*/
	
	
}
