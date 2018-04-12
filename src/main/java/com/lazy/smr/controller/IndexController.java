package com.lazy.smr.controller;

import com.alibaba.fastjson.JSON;
import com.lazy.smr.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("index")
    public String page(){
        return "/index";
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
        User user=new User();
        user.setName("gys");
        user.setAge(2);
        session.setAttribute("user", JSON.toJSONString(user));
        return "/success";
    }

    @ResponseBody
    @RequestMapping("/get")
    public Object get(HttpSession session) {
        Object user=session.getAttribute("user");
        return user+"==========>22";
    }
}
