package kr.hs.study.BankSysPro.controller;

import kr.hs.study.BankSysPro.dto.CustomerDto;
import kr.hs.study.BankSysPro.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

    @GetMapping("/")
    public String signUp() {
        return "sign_up";
    }

    @PostMapping("/signUp")
    public String signUp(CustomerDto dto) {
        service.insert(dto);
        return "redirect:/";
    }
}
