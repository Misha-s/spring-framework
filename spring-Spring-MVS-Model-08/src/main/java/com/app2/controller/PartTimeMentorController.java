package com.app2.controller;

import com.app2.enums.Gender;
import com.app2.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/part-time")
public class PartTimeMentorController {

    @RequestMapping("/mentor")
    public String displayMentors(Model model){
        List<Mentor> mentorsList = new ArrayList<>();
        mentorsList.add(new Mentor("Jack","Drew",35, Gender.MALE));
        mentorsList.add(new Mentor("Tamara","Hanks",53,Gender.FEMALE));
        mentorsList.add(new Mentor("Ammy","Bryan",42,Gender.FEMALE));
        model.addAttribute("mentors",mentorsList);
        return "mentor/mentor";
    }
}
