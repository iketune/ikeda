package com.example.web.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/** ユーザー情報Entity */
@Entity
@Table(name = "user_info")
@Data
public class UserInfo {

	/** ログインID */
	@Id
	@Column(name = "login_id")
	private String loginId;
	
	/** パスワード */
	@Column(name = "password")
	private String password;
}
