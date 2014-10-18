package com.ritik.rfp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ritikk on 10/18/2014.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        return "welcome";
    }
}
