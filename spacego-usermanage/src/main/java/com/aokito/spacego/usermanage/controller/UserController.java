package com.aokito.spacego.usermanage.controller;

import com.aokito.spacego.usermanage.bean.UserInfo;
import com.aokito.spacego.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String addUser(UserInfo userInfo){
        userService.addUserInfo(userInfo);
        return "success";
    }

    @GetMapping("/user")
    public UserInfo getUserInfo(@RequestParam("id") String id){
        UserInfo userInfo = userService.getUserInfo(id);
        return userInfo;
    }
}
