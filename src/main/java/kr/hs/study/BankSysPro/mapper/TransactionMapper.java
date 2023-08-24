package kr.hs.study.BankSysPro.mapper;

import kr.hs.study.BankSysPro.dto.AccountDto;
import kr.hs.study.BankSysPro.dto.TransactionDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TransactionMapper {
    public void insert(TransactionDto dto);
    public List<TransactionDto> list();
    public List<TransactionDto> list2(int id);
    public void update(TransactionDto dto);
}
