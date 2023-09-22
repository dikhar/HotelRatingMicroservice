package com.user_serivice.userService.repository;

import com.user_serivice.userService.entity.User;
//import com.user_serivice.userService.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<User,String> {

}
