package kr.hs.study.BankSysPro.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AccountDto {
    private int a_id;
    private String account_number;
    private int balance;
    private String bank_name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date opening_date;
}
