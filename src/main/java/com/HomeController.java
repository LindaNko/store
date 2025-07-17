package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
       @RequestMapping("path", method=RequestMethod.GET)
       public String requestMethodName(@RequestParam String param) {
           return new String();
       }
       
    public String index(){
        return "index.html";
    }
}
