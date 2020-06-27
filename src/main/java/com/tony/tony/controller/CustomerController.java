package com.tony.tony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    // todo: 로그인 화면
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    // todo: 회원관리 화면
    // todo: 소셜로그인


}
