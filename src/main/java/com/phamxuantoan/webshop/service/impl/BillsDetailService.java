package com.phamxuantoan.webshop.service.impl;

import com.phamxuantoan.webshop.dto.BillsDetailDTO;
import com.phamxuantoan.webshop.dto.UserDTO;
import com.phamxuantoan.webshop.entity.BillsDetailEntity;
import com.phamxuantoan.webshop.entity.UserEntity;
import com.phamxuantoan.webshop.exception.NotFoundException;
import com.phamxuantoan.webshop.repository.BillsDetailRepository;
import com.phamxuantoan.webshop.service.IBillsDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillsDetailService implements IBillsDetailService {
    @Autowired
    private BillsDetailRepository billsDetailRepository;

    @Autowired
    private final ModelMapper mapper;

    public BillsDetailService(ModelMapper mapper) {
        this.mapper = mapper;
    }
    @Override
    public List<BillsDetailDTO> findAll() {
        List<BillsDetailDTO> data = new ArrayList<>();
        List<BillsDetailEntity> entity = billsDetailRepository.findAll();

        for(BillsDetailEntity item:entity) {

            data.add(mapper.map(item, BillsDetailDTO.class));
        }

        return data;
    }

    @Override
    public BillsDetailDTO getBillDetailById(Integer id) {
        List<BillsDetailEntity> entity = billsDetailRepository.findAll();
        for(BillsDetailEntity i:entity){
            if(i.getId() == id){
                BillsDetailDTO data = mapper.map(i,BillsDetailDTO.class);
                return data;
            }

        }throw  new NotFoundException("BILLS_NOT_FOUND_IN");
    }

    public List<BillsDetailDTO> getDetailByBillId(Integer id) {
        List<BillsDetailDTO> data = new ArrayList<>();
        List<BillsDetailEntity> entity = billsDetailRepository.findBillByDetailId(id);
        for(BillsDetailEntity i:entity){

            data.add(mapper.map(i,BillsDetailDTO.class));
        };
        return data;
    }

    @Override
    public BillsDetailDTO saveOrUpdate(BillsDetailEntity billsdetail) {
        BillsDetailDTO data = new BillsDetailDTO();

        BillsDetailEntity entity = billsDetailRepository.save(billsdetail);
        data = mapper.map(entity, BillsDetailDTO.class);
        return data;
    }


    @Override
    public void delete(Integer[] ids) {
        for(Integer item:ids) {

            billsDetailRepository.deleteById(item);
        }
    }
}
