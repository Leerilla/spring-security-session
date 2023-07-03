package com.ohgiraffers.layered.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {

    @GetMapping("/login")
    public String loginIndex(){

        return "views/common/login.html";
    }

    @GetMapping("/hello")
    public String loginSuccess(){
        return "views/common/hello";
    }
}
