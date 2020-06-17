package com.xiagao.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @ResponseBody
//    @PostMapping(value = "/login.do")
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(@RequestBody String username) {
        System.out.println(username);
        return username;
    }

}
