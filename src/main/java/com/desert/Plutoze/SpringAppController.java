package com.desert.Plutoze;

//import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SpringAppController {


    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/viewprofile")
    public String view() {
        return "home";
    }
}