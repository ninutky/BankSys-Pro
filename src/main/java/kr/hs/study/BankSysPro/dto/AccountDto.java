package kr.hs.study.BankSysPro.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AccountDto {
    private int a_id;
    private String account_number;  // 계좌 번호
    private int balance;            // 잔액
    private String bank_name;       // 은행 이름
}
