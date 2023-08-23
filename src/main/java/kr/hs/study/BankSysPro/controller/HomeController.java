package kr.hs.study.BankSysPro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 홈화면
    @GetMapping("/")
    public String index() {
        return "index";
    }

}
