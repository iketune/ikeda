package com.example.web.database.dto;

import lombok.Data;

/** ログイン画面 入力情報DTO */
@Data
public class LoginFormDto {
	/** ログインID */
	private String loginId;
	/** パスワード */
	private String password;
}
