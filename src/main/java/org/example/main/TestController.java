package org.example.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
@RestController
public class TestController {

    @GetMapping(value = "/")
    public String index(Model model, HttpServletRequest request) {
        System.out.println("Hello 80");
        return "Hello 80";
    }
}
