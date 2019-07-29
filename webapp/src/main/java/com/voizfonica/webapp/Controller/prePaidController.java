package com.voizfonica.webapp.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class prePaidController {

    @GetMapping("/")
    public String func()
    {
        return "prePaid";
    }

}
