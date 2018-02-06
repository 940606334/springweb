package com.yearcon.productweb.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ayong
 * @create 2018-02-06 10:22
 **/
@Controller
public class ErrorController {
    @GetMapping("/404")
    public String nofind(){
        return "error/404";
    }
}
