package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.CustomerDTO;
import com.cydeo.lab08rest.dto.DiscountDTO;
import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.entity.Customer;
import com.cydeo.lab08rest.entity.Discount;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.CustomerRepository;
import com.cydeo.lab08rest.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final MapperUtil mapperUtil;

    public CustomerServiceImpl(CustomerRepository customerRepository, MapperUtil mapperUtil) {
        this.customerRepository = customerRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public CustomerDTO findById(Long customerId) {

        return customerRepository.findById(customerId)
                .stream()
                .map(customer -> mapperUtil.convert(customer, new CustomerDTO()))
                .findFirst().orElseThrow();
    }

    @Override
    public List<CustomerDTO> readAll() {

        return customerRepository.findAll().stream()
                .map(customer -> mapperUtil.convert(customer, new CustomerDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO update (CustomerDTO customerDTO) {

        Customer customer = customerRepository.save(mapperUtil.convert(customerDTO, new Customer()));
        return mapperUtil.convert(customer, new CustomerDTO());
    }

    @Override
    public CustomerDTO create(CustomerDTO customerDTO) {

        Customer customer = customerRepository.save(mapperUtil.convert(customerDTO, new Customer()));
        return mapperUtil.convert(customer, new CustomerDTO());
    }

    @Override
    public CustomerDTO readByEmail(String email) {

        return mapperUtil.convert(customerRepository.retrieveByCustomerEmail(email), new CustomerDTO());
    }
}