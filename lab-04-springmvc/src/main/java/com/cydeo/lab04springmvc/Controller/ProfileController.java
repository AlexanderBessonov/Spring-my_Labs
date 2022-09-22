package com.cydeo.lab04springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String profileInfo(Model model){
        model.addAttribute("profile",ProfileController.class);

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