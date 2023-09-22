package com.user_serivice.userService.services;

import com.user_serivice.userService.entity.User;

import java.util.List;

public interface userService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String userId);

}
