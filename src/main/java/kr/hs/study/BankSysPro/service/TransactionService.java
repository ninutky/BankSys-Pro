package kr.hs.study.BankSysPro.service;

import kr.hs.study.BankSysPro.dto.AccountDto;
import kr.hs.study.BankSysPro.dto.TransactionDto;

import java.util.List;

public interface TransactionService {
    public void insert(TransactionDto dto);
    public List<TransactionDto> list();
    public List<TransactionDto> list2(int id);
    public void delete(TransactionDto dto);
    public void update(TransactionDto dto);
    public void accountTransactionJoin(TransactionDto dto);
}
