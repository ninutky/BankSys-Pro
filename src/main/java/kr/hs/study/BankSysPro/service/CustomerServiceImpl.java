package kr.hs.study.BankSysPro.service;

import kr.hs.study.BankSysPro.dto.CustomerDto;
import kr.hs.study.BankSysPro.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper mapper;

    @Override
    public void insert(CustomerDto dto) {
        mapper.insert(dto);
    }

    @Override
    public List<CustomerDto> list() {
        return mapper.list();
    }

    @Override
    public void delete(CustomerDto dto) {
        mapper.delete(dto);
    }

    @Override
    public void update(CustomerDto dto) {
        mapper.update(dto);
    }
}
