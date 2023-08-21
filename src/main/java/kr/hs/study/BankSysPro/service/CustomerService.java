package kr.hs.study.BankSysPro.service;

import kr.hs.study.BankSysPro.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    public void insert(CustomerDto dto);
    public List<CustomerDto> list();
    public void delete(CustomerDto dto);
    public void update(CustomerDto dto);
}
