package com.askhub.controllers;

import com.askhub.pojos.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/signup")
public class SignupController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get() {
        return new ModelAndView("signup", "user", new User());
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(@ModelAttribute User user) {
        //here should be some db stuff
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
        return "redirect:index";
    }
}
