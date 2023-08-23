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
    @GetMapping("/register")
    public String register() {
        return "register_account";
    }
    @PostMapping("/register")
    public String register(AccountDto dto) {
        service.insert(dto);
        return "redirect:/list";
    }

    // 리스트
    @GetMapping("/list")
    public String list(Model model){
        List<AccountDto> list = service.list();
        model.addAttribute("list", list);
        return "list";
    }

    // 수정 페이지
    @GetMapping("/update/{account_number}")
    public String update(Model model, AccountDto dto) {
        List<AccountDto> list = service.list2(dto.getAccount_number());
        model.addAttribute("list", list);
        return "update_form";
    }
    @PostMapping("/update")
    public String update(AccountDto dto) {
        service.update(dto);
        return "update_success";
    }

    // 삭제 페이지
    @GetMapping("/delete/{account_number}")
    public String delete(AccountDto dto) {
        service.delete(dto);
        return "delete_success";
    }

    // 계좌 정보
    @GetMapping("/accountInfo/{account_number}")
    public String accountInfo(Model model, AccountDto dto) {
        List<AccountDto> list = service.list2(dto.getAccount_number());
        model.addAttribute("list", list);
        return "accountInfo";
    }

    // 거래 내역
    @GetMapping("/transaction/{account_number}")
    public String transaction() {
        return "transaction";
    }
}
