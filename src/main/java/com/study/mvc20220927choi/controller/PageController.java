package com.study.mvc20220927choi.controller;

import com.study.mvc20220927choi.dto.TestReqDto;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLOutput;

@Controller
public class PageController {
    //crud
    //c : create    r :     u : put     d : delete

    @GetMapping("/test1")   //페이지주소
    public String test1(Model model) {
        model.addAttribute("name","김준일");
        return "test_page1";
    }

    @GetMapping("/test2")
    public ModelAndView test2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("testdata","test");
        modelAndView.setViewName("test/test_page2");
        return modelAndView;
    }

    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data", strData);
        model.addAttribute("name", name);
        return "test/test_page3";
    }
    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto) {
        System.out.println(testReqDto);


        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());

        return "test/test_page4";
    }
}
