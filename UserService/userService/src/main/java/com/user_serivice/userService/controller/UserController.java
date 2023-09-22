package com.user_serivice.userService.controller;

import com.user_serivice.userService.config.MyConfiguration;
import com.user_serivice.userService.entity.User;
import com.user_serivice.userService.services.impl.UserServiceImpl;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User user1=userServiceImpl.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @RequestMapping("/getAll")
    public ResponseEntity<List<User>> getUser()
    {
        List<User> alluser=userServiceImpl.getAllUser();
        return ResponseEntity.ok(alluser);
    }
    @RequestMapping("/{userId}")
    @CircuitBreaker(name = "ratingHotelBreaker",fallbackMethod = "ratingHotelFallBack")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId)
    {
        User user=userServiceImpl.getUser(userId);
        return ResponseEntity.ok(user);
    }
    public ResponseEntity<User>ratingHotelFallBack(Exception ex)
    {
        User user=User.builder().name("Resiliance").mail("!@#").about("ERRor").build();
        return ResponseEntity.ok(user);
    }
}
