package com.cydeo.lab04springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {

     @RequestMapping("/lab")
     public String labInfo(Model model){

         String firstl = "lab-00-coupling";
         String secondl = "lab-01-ioc";
         String thirdl ="lab-02-di";
         String fourl = "lab-03-springboot";
         String fifthl = "lab-04-springmvc";

         model.addAttribute("firstLab",firstl);
         model.addAttribute("secondLab",secondl);
         model.addAttribute("thirdLab",thirdl);
         model.addAttribute("fourthLab",fourl);
         model.addAttribute("fifthLab",fifthl);

      return "lab/lab-list";
     }
}
/*
 String name1 = "ABC";

        model.addAttribute("A",name1);
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

    <h1 th:text = "${firstLab}"></h1>
    <h1 th:text = "${secondLab}"></h1>
    <h1 th:text = "${thirdLab}"></h1>
    <h1 th:text = "${fourthLab}"></h1>
    <h1 th:text = "${fifthLab}"></h1>

 */