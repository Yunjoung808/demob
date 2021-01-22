package com.example.demob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/first")
    public String first(){

        return "first.html";
    }

    @RequestMapping("/datajson")
    public String datajson(){

        return "data-json.html";
    }

    @RequestMapping("/datalocal")
    public String datalocal(){

        return "data-local.html";
    }

    @RequestMapping("/logingoogle")
    public String login(){

        return "login-google.html";
    }

    @RequestMapping("/dashboard")
    public String dashboard(){

        return "list-columns-1.html";
    }
}
