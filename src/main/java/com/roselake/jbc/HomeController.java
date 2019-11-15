package com.roselake.jbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value={"/", "/index", "/home"})
    public String home(){
        return "index";
    }

    // presently this page does not ever load
    @GetMapping("/blogs")
    public String blogs(){
        return "blogs";
    }

    @GetMapping("/javabasics")
    public String javabasics(){
        return "javabasics";
    }

    @GetMapping("/javaoo")
    public String javaoo(){
        return "javaoo";
    }

    @GetMapping("/frontend")
    public String frontend(){
        return "frontend";
    }

    @GetMapping("/git")
    public String git(){
        return "git";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/author")
    public String author(){
        return "author";
    }

}
