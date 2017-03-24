package hu.jonci.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    public String landingPage() {
        return "index";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    
//
//    @RequestMapping(value = "/error", method = RequestMethod.GET)
//    public String error() {
//        return "error";
//    }
//
//    @RequestMapping(value = "/success", method = RequestMethod.GET)
//    public String success() {
//        return "success";
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String register() {
//        return "register";
//    }

}
