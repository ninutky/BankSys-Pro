package kr.hs.study.BankSysPro.service;

import kr.hs.study.BankSysPro.dto.AccountDto;
import kr.hs.study.BankSysPro.dto.TransactionDto;
import kr.hs.study.BankSysPro.mapper.AccountMapper;
import kr.hs.study.BankSysPro.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionMapper mapper;

    @Override
    public void insert(TransactionDto dto) {
        mapper.insert(dto);
    }

    @Override
    public List<TransactionDto> list() {
        return mapper.list();
    }

    @Override
    public List<TransactionDto> list2(int id) {
        return mapper.list2(id);
    }

    @Override
    public void delete(TransactionDto dto) {
        mapper.delete(dto);
    }

    @Override
    public void update(TransactionDto dto) {
        mapper.update(dto);
    }

    @Override
    public void accountTransactionJoin(TransactionDto dto) {
        mapper.accountTransactionJoin(dto);
    }
}
