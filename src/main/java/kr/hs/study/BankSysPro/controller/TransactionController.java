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
    @GetMapping("/register_transaction/{a_id}")
    public String register_transaction() {
        return "register_transaction";
    }
    // 등록 버튼 눌렀을 때
    @PostMapping("/register_transaction")
    public String register_transaction(TransactionDto dto) {
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

//    // 수정 페이지
//    @GetMapping("/update/{a_id}")
//    public String update(@PathVariable("a_id") int aId, Model model, AccountDto dto) {
//        List<AccountDto> list = service.list2(aId);
//        model.addAttribute("list", list);
//        return "update_form";
//    }
//    @PostMapping("/update")
//    public String update(AccountDto dto) {
//        service.update(dto);
//        return "update_success";
//    }
//
//    // 삭제 페이지
//    @GetMapping("/delete/{a_id}")
//    public String delete(AccountDto dto) {
//        service.delete(dto);
//        return "delete_success";
//    }
//
//    // 거래 내역
//    @GetMapping("/transaction/{a_id}")
//    public String transaction(Model model) {
//        List<AccountDto> list = service.list();
//        return "transaction";
//    }
}
