package kr.hs.study.BankSysPro.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TransactionDto {
    private int a_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date transaction_date;      // 거래 날짜
    private String account_number;      // 계좌번호
    private String transaction_type;    // 거래 유형
    private int transaction_amount;     // 거래 금액
    private int balance;                // 잔액
    private String description;         // 거래에 대한 설명
}
