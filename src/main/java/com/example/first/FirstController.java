package com.example.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class FirstController {

    @RequestMapping("/hello")
    @ResponseBody
    public String aa() {
        return "First WAS";
    }

    @RequestMapping("/cc")
    @ResponseBody
    public String caa() {
        return "First cicd";
    }
}
