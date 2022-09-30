package com.study.mvc20220927choi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.PublicKey;

@Controller
public class PageControllerTest {

    @GetMapping("/study1")
    public String study1(Model model) {
        model.addAttribute("name", "최영찬");
        return "study_page1";
    }

    @GetMapping("/study2")
    public String study2(Model model) {
        model.
    }

}
