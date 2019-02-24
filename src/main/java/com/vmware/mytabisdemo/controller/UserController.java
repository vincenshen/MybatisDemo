package com.vmware.mytabisdemo.controller;


import com.vmware.mytabisdemo.service.UserService;
import com.vmware.mytabisdemo.viewobject.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "user")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get")
    @ResponseBody
    public UserVO getUser(@RequestParam(name = "id") Integer id){
        return userService.getUserById(id);
    }
}
