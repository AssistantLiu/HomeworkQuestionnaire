package com.ybsteer.demon.Controler;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class IndexController {
    @GetMapping("answer")
    public String index() {
        return "answer";
    }
}
