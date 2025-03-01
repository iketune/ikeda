package com.example.web.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.database.entity.UserInfo;

/** ユーザー情報リポジトリ */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, String>{

}
