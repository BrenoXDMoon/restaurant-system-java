package br.com.brenoxdmoon.restaurant_system.core.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateCheckDTO extends AbstractDTO {

    private String customerName;
    private String customerPhoneNumber;
    private List<ItemDTO> items;

}
