package com.example.web.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.web.database.entity.UserInfo;
import com.example.web.database.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

/** ログインサービス */
@Service
@RequiredArgsConstructor
public class LoginService {

	/** ユーザー情報リポジトリ */
	private final UserInfoRepository userInfoRepository;
	
	/**
	 * ユーザー情報検索
	 * @param loginId ログインID
	 * @return Optional<UserInfo> ユーザー情報Entity
	 */
	public Optional<UserInfo> findById(String loginId){
		
		return userInfoRepository.findById(loginId);
	}
}
