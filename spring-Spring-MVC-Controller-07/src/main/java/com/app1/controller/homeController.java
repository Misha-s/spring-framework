package com.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // @Controller is stereotype annotation - @Component-@ComponentScan
public class homeController {
    @RequestMapping("/home") // @RequestMapping annotation associates the action with HTTP request path
    public String homepage(){
        return "home.html"; // Return the HTML document name
    }

    @RequestMapping("/welcome")
    public String homepage2(){
        return "welcomepage.html";
    }


}
