package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String name = request.getParameter("employeeName");
//        name = "Mr. " + name;
//        model.addAttribute("nameAttribute", name);
//        model.addAttribute("team", "Development Team");
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName")String name, Model model) {
        name = "Mr. " + name;
        model.addAttribute("nameAttribute", name);
        model.addAttribute("team", "Development Team");
        return "show-emp-details-view";
    }



}
