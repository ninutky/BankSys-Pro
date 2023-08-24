package kr.hs.study.BankSysPro.controller;

import kr.hs.study.BankSysPro.dto.AccountDto;
import kr.hs.study.BankSysPro.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService service;

    // 등록 페이지
    @GetMapping("/register_account")
    public String register_account() {
        return "register_account";
    }
    @PostMapping("/register_account")
    public String register_account(AccountDto dto) {
        service.insert(dto);
        return "register_success";
    }

    // 리스트
    @GetMapping("/list_account")
    public String list_account(Model model){
        List<AccountDto> list = service.list();
        model.addAttribute("list", list);
        return "list_account";
    }

    // 수정 페이지
    @GetMapping("/update/{a_id}")
    public String update(@PathVariable("a_id") int aId, Model model, AccountDto dto) {
        List<AccountDto> list = service.list2(aId);
        model.addAttribute("list", list);
        return "account_update_form";
    }
    @PostMapping("/update")
    public String update(AccountDto dto) {
        service.update(dto);
        return "update_success";
    }

    // 삭제 페이지
    @GetMapping("/delete/{a_id}")
    public String delete(AccountDto dto) {
        service.delete(dto);
        return "delete_success";
    }

}
