package com.controller;

import com.entity.User;
import com.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    String index() { return "hello";}

    @PostMapping("/add")
    String add(@RequestBody User user) {
       userService.add(user);
       return "ok";
    }

    @PostMapping("/list")
    List<User> list(){
        return userService.list();
    }

    @PostMapping("/get")
    User get(@RequestBody String id){
        return userService.get(id);
    }

    @PostMapping("update")
    String update(@RequestBody User user){
        userService.update(user);
        return "ok";
    }
}