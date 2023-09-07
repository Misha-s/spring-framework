package com.app2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class studentController {
    @RequestMapping("/welcome")
    public String homepage(Model model){
        model.addAttribute("name","app1");
        model.addAttribute("course","Spring MVC");


        int studentId =  new Random().nextInt(1000);
        System.out.println(studentId);
        model.addAttribute("studentId",studentId);

        List<Integer> listNumbers = Arrays.asList(3,5,7,9,0);
        model.addAttribute("numbers",listNumbers);
        return "student/welcome";
    }
}
