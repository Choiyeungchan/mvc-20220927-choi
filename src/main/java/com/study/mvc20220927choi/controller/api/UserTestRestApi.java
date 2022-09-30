package com.study.mvc20220927choi.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTestRestApi {

    @GetMapping("/api/test/user/rest")
    public String getUername() {
        return "홍길동";
    }

}
