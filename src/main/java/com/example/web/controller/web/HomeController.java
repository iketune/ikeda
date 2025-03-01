package com.example.web.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/** ホームコントローラー */
@Controller
public class HomeController {

	/**
	 * ホーム画面表示
	 * @return ホーム画面
	 */
	@GetMapping("/home")
	public String homeView() {
		return "home";
	}
}
