package com.xiagao.controller;


import com.xiagao.service.UserService;
import com.xiagao.service.userServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @ResponseBody
//    @PostMapping(value = "/login.do")
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(@RequestBody String username) {
        System.out.println(username);
        return username;
    }


    @RequestMapping(value = "/findUserByUsername.do", method = RequestMethod.POST)
    public String findUserByUsername(@RequestBody String username){

        return "";
    }

}
