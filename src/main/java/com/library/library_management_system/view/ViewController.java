package com.library.library_management_system.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String getHomePage() {
        // This just returns the name of the single HTML file. Nothing else.
        return "index";
    }
}