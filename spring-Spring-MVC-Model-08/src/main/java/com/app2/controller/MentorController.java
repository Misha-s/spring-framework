package com.app2.controller;

import com.app2.enums.Gender;
import com.app2.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/full-time")
public class MentorController {

    @RequestMapping("/mentor")
    public String displayMentors(Model model){

        List<Mentor> mentorsList = new ArrayList<>();
        mentorsList.add(new Mentor("Mike","Smith",45,Gender.MALE));
        mentorsList.add(new Mentor("Tom","Hanks",65,Gender.MALE));
        mentorsList.add(new Mentor("Ammy","Bryan",25,Gender.FEMALE));
        model.addAttribute("mentors",mentorsList);
        return "mentor/mentor";
    }
}
