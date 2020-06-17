package com.xiagao.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @PostMapping(value = "/login.do")
//    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(@RequestBody JSONObject jsonObject) {
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }

}
