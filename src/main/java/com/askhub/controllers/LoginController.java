package com.askhub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.askhub.pojos.User;

@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get(/*ModelMap model*/) {
        //same things
//        model.addAttribute("user", new User());
//        return "login";
        return new ModelAndView("login", "user", new User());
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(@ModelAttribute User user) {
        //here should be some db stuff
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return "redirect:index";
    }
}
