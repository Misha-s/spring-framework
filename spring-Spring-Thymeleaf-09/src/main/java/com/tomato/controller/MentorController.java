package com.tomato.controller;

import com.tomato.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("mentor",new Mentor());
       List<String> batchList = Arrays.asList("Batch01","Batch02","Batch03",
               "Batch04","SBatch01","SBatch02","SBatch03");
       model.addAttribute("batchList",batchList);
        return "/mentor/mentor-register";
    }

}
