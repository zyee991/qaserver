package com.itcuc.qaserver.web;

import com.itcuc.qaserver.model.User;
import com.itcuc.qaserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/signup")
    public User signup(@RequestBody User user) {
        user = userService.signup(user);
        return user;
    }
}