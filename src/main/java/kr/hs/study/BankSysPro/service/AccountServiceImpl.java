package kr.hs.study.BankSysPro.service;

import kr.hs.study.BankSysPro.dto.AccountDto;
import kr.hs.study.BankSysPro.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper mapper;

    @Override
    public void insert(AccountDto dto) {
        mapper.insert(dto);
    }

    @Override
    public List<AccountDto> list() {
        return mapper.list();
    }

    @Override
    public List<AccountDto> list2(int id) {
        return mapper.list2(id);
    }

    @Override
    public void delete(AccountDto dto) {
        mapper.delete(dto);
    }

    @Override
    public void update(AccountDto dto) {
        mapper.update(dto);
    }
}
