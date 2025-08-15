package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        Employee emp = new Employee();
//        emp.setName("Gary");
//        emp.setSurname("Nest");
//        emp.setSalary(10000);
        model.addAttribute("employee", emp);
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
        String name = employee.getName();
        employee.setName("Mr. " + name);
        String surname = employee.getSurname();
        employee.setSurname(surname + "!");
        int salary = employee.getSalary();
        employee.setSalary(salary * 10);
        return "show-emp-details-view";
    }



}
