package kr.hs.study.BankSysPro.mapper;

import kr.hs.study.BankSysPro.dto.CustomerDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    public void insert(CustomerDto dto);
    public List<CustomerDto> list();
    public List<CustomerDto> list2(int id);
    public void delete(CustomerDto dto);
    public void update(CustomerDto dto);
}
