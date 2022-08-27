package com.phamxuantoan.webshop.dto;

import com.phamxuantoan.webshop.entity.BillsDetailEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO extends BaseDTO<ProductDTO> {
    private Integer catalogID;
    private String productName;
    private String content;
    private double price;
    private Integer discount;
    private String imageLink;
    private String imageList;
    private Integer viewCount;
    private Integer buyedCount;
    private Integer rateTotal;
    private Integer rateCount;
    List<BillsDetailEntity> bills;
}
