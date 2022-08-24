package com.phamxuantoan.webshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SliderDTO extends BaseDTO<SliderDTO> {
    private String sliderName;
    private String imageLink;
    private Integer sortOrder;

}
