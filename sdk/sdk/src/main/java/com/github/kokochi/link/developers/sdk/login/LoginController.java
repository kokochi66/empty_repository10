package com.github.kokochi.link.developers.sdk.login;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
@Log4j2
public class LoginController {

    @GetMapping("")
    public String loginGET() {
        log.info("/login - 로그인");
        return "login/login";
    }
}
