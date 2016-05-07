package com.ZeroCorp.Controllers;

import com.ZeroCorp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Nahid on 5/7/2016.
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/home")
    public String home(){

     return "home";
    }

    @RequestMapping("/create")
    @ResponseBody
    public String createUser(@RequestParam("name") String name){

        userService.createUser(name);
        return "okay";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(@RequestParam("name") String name ){

        userService.getUserByName(name);
        return "okay";
    }
}
