package kr.hs.study.BankSysPro.controller;

import kr.hs.study.BankSysPro.dto.AccountDto;
import kr.hs.study.BankSysPro.dto.TransactionDto;
import kr.hs.study.BankSysPro.service.AccountService;
import kr.hs.study.BankSysPro.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TransactionController {
    @Autowired
    private TransactionService service;

    // 등록 페이지
    @GetMapping("/register_transaction/{a_id}/{account_number}")
    public String register_transaction(
            @PathVariable("a_id") int aId,
            @PathVariable("account_number") String accountNumber,
            Model model) {
        model.addAttribute("a_id", aId);
        model.addAttribute("account_number", accountNumber);
        return "register_transaction";
    }
    // 등록 버튼 눌렀을 때
    @PostMapping("/register_transaction/{a_id}/{account_number}")
    public String register_transaction(
            TransactionDto dto,
            @PathVariable("a_id") int aId,
            @PathVariable("account_number") String accountNumber) {
        dto.setA_id(aId);
        dto.setAccount_number(accountNumber);
        service.insert(dto);
        return "register_success";
    }

    // 리스트
    @GetMapping("/transaction/{a_id}")
    public String transactionid(TransactionDto dto, Model model){
        List<TransactionDto> list2 = service.list2(dto.getA_id());
        model.addAttribute("list", list2);
        return "transaction";
    }

    @GetMapping("/transaction")
    public String transaction(Model model){
//        List<TransactionDto> list2 = service.accountTransactionJoin();
        List<TransactionDto> list2 = service.list();
        model.addAttribute("list", list2);
        return "transaction";
    }
}
