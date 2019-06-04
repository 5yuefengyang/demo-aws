package com.example.demoaws.controller;


import com.example.demoaws.domain.User;
import com.example.demoaws.domain.map.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class AwsController {

    @Resource
    private UserMapper userMaper;

    @RequestMapping("/")
    @ResponseBody
    public String index(){

        return "Hello Aws RDS!";
    }


    @RequestMapping(value="/user" ,method=GET)
    @ResponseBody
    public String findName(@RequestParam("name") String name){

        User user = this.userMaper.findByName(name);


        return user==null?"找不到对应的用户":user.toString();

    }
}
