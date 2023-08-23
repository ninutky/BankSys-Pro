package kr.hs.study.BankSysPro.mapper;

import kr.hs.study.BankSysPro.dto.AccountDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    public void insert(AccountDto dto);
    public List<AccountDto> list();
    public List<AccountDto> list2(int id);
    public void delete(AccountDto dto);
    public void update(AccountDto dto);
}
