package indi.qding.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/success")
    public String toSuccess(){
        return "success";
    }
}
