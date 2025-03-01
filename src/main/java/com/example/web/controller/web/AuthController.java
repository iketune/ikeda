package com.example.web.controller.web;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.web.database.dto.LoginFormDto;
import com.example.web.database.entity.UserInfo;
import com.example.web.service.LoginService;

import lombok.RequiredArgsConstructor;

/**
 * ログインコントローラー
 * 新規登録コントローラー
 */
@Controller
@RequiredArgsConstructor
public class AuthController {

	/** ログインサービス */
	private final LoginService loginService;

	/**
	 * 初期表示へリダイレクト
	 * @return loginURL
	 */
	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}

	/**
	 * 初期表示 ログイン画面
	 * @param model モデル
	 * @param loginForm 入力情報
	 * @return ログイン画面
	 */
	@GetMapping("/login")
	public String loginView(Model model, LoginFormDto loginForm) {
		model.addAttribute("loginForm", new LoginFormDto());
		return "login";
	}

	/**
	 * ログイン処理
	 * @param model モデル
	 * @param loginForm 入力情報
	 * @return ホーム画面
	 */
	@PostMapping("/login")
	public String login(Model model, LoginFormDto loginForm) {
		model.addAttribute("loginForm", new LoginFormDto());
		
		Optional<UserInfo> userInfo = loginService.findById(loginForm.getLoginId());
		boolean isCorrectUserAuth = userInfo.isPresent()
				&& loginForm.getPassword().equals(userInfo.get().getPassword());
		if(isCorrectUserAuth) {
			return "redirect:/home";
		}
		return "login";
	}

	// TODO 新規登録画面用
	/*@GetMapping("/register")
	 public String registerView(Model model, RegisterFormDto registerForm) {
		
	}*/
}
