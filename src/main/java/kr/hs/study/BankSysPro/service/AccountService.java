package kr.hs.study.BankSysPro.service;

import kr.hs.study.BankSysPro.dto.AccountDto;
import kr.hs.study.BankSysPro.dto.TransactionDto;

import java.util.List;

public interface AccountService {
    public void insert(AccountDto dto);
    public List<AccountDto> list();
    public List<AccountDto> list2(int id);
    public void delete(AccountDto dto);
    public void update(AccountDto dto);
    public List<AccountDto> calculateHigherBalanceAccounts();
    public double calculateAverageBalance();
}
