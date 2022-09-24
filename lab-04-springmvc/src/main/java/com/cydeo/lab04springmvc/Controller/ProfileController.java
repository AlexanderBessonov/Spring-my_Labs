package com.cydeo.lab04springmvc.Controller;

import com.cydeo.lab04springmvc.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String profileInfo(Model model){
        Profile profile = new Profile("msmith@gmail.com","+1256342345",
                "mike","smith","msmith", LocalDateTime.now());

        model.addAttribute("profile",profile);

        return "profile/profile-info";
    }

}
/*
<h1 th:text = "${profile.getName()}"></h1>
<h1 th:text = "${profile.getSurname()}"></h1>
<h1 th:text = "${profile.getUserName()}"></h1>
<h1 th:text = "${profile.getPhoneNumber()}"></h1>
<h1 th:text = "${profile.getEmail()}"></h1>
<h1 th:text = "${profile.getCreatedDate()}"></h1>
 */