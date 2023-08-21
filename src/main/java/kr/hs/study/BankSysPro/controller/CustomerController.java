package kr.hs.study.BankSysPro.controller;

import kr.hs.study.BankSysPro.dto.CustomerDto;
import kr.hs.study.BankSysPro.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signUp")
    public String signUp() {
        return "sign_up";
    }

    @PostMapping("/signUp")
    public String signUp(CustomerDto dto) {
        service.insert(dto);
        return "redirect:/";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<CustomerDto> list = service.list();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("/update/{id}")
    public String update(CustomerDto dto, Model model) {
        List<CustomerDto> list = service.list2(dto.getId());
        model.addAttribute("list", list);
        return "update_form";
    }

    @PostMapping("/update")
    public String update(CustomerDto dto) {
        service.update(dto);
        return "redirect:/list";
    }
}
