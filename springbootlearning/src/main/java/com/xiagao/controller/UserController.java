package com.xiagao.controller;


import com.xiagao.model.pojo.User;
import com.xiagao.service.UserService;
import com.xiagao.service.userServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @ResponseBody
//    @PostMapping(value = "/login.do")
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(@RequestBody String username) {
        System.out.println(username);
        return username;
    }


    @RequestMapping(value = "/findUserByUsername.do", method = RequestMethod.POST)
    public User findUserByUsername(@RequestBody String username){
        User user = userService.findUserByUsername(username);
        return user;
    }

    @RequestMapping(value = "/saveOne.do", method = RequestMethod.POST)
    public String saveOne(User user){
        boolean b = userService.saveOne(user);
        if (b){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

}
