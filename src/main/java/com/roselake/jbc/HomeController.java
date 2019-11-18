package com.roselake.jbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(value={"/"})
    public String home(){
        return "index";
    }

    @GetMapping("/basics")
    public String basics(){
        return "basics";
    }

    @GetMapping("/basics1")
    public String basics1() {return "basics1"; }

    @GetMapping("/basics2")
    public String basics2() {return "basics2"; }

    @GetMapping("/oo")
    public String oo(){
        return "oo";
    }

    @GetMapping("/oo1")
    public String oo1() { return "oo1"; }

    @GetMapping("/oo2")
    public String oo2() { return "oo2"; }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/author")
    public String author(){
        return "author";
    }

}
