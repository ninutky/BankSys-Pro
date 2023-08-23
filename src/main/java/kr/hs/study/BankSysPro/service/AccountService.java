package kr.hs.study.BankSysPro.service;

import kr.hs.study.BankSysPro.dto.AccountDto;

import java.util.List;

public interface AccountService {
    public void insert(AccountDto dto);
    public List<AccountDto> list();
    public List<AccountDto> list2(String id);
    public void delete(AccountDto dto);
    public void update(AccountDto dto);
}
