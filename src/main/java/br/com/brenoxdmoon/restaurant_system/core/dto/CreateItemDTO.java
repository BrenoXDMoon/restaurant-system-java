package br.com.brenoxdmoon.restaurant_system.core.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateItemDTO extends AbstractDTO {

    private String name;
    private String code;
    private String description;
    private BigDecimal price;

}
