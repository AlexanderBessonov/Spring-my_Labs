package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.DiscountDTO;
import com.cydeo.lab08rest.entity.Discount;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.DiscountRepository;
import com.cydeo.lab08rest.service.DiscountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountServiceImpl implements DiscountService {

    public final DiscountRepository discountRepository;
    public final MapperUtil mapperUtil;

    public DiscountServiceImpl(DiscountRepository discountRepository, MapperUtil mapperUtil) {
        this.discountRepository = discountRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<DiscountDTO> readAll() {

        return discountRepository.findAll().stream()
                .map(discount -> mapperUtil.convert(discount, new DiscountDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public DiscountDTO update(DiscountDTO discountDTO) {
    //  Discount discount = discountRepository.findById(discountDTO.getId()).get();

        Discount discount = discountRepository.save(mapperUtil.convert(discountDTO, new Discount()));
        return mapperUtil.convert(discount, new DiscountDTO());
    }

    @Override
    public DiscountDTO create(DiscountDTO discountDTO) {

        Discount discount = discountRepository.save(mapperUtil.convert(discountDTO, new Discount()));
        return mapperUtil.convert(discount, new DiscountDTO());
    }

    @Override
    public DiscountDTO readByName(String name) {

        return mapperUtil.convert(discountRepository.findFirstByName(name), new DiscountDTO());
    }
}
