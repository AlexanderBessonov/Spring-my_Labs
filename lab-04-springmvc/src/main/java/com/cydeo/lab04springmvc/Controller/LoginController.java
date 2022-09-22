package com.cydeo.lab04springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
     @RequestMapping("/login/{email}/{phoneNumber}")
    public String loginInfo(@PathVariable String Email,@PathVariable String phonenumber , Model model){

         String successful = "Login successful";

         model.addAttribute("email",Email);
         model.addAttribute("phoneNumber",phonenumber);
         model.addAttribute("loginMessage",successful);

         return"login/login-info";
    }
}
/*
 String fifthl = "lab-04-springmvc";

         model.addAttribute("firstLab",firstl);
         model.addAttribute("secondLab",secondl);
h1 th:text = "${email}"></h1>
<h1 th:text = "${phoneNumber}"></h1>
<h1 th:text = "${loginMessage}"></h1>
 */
