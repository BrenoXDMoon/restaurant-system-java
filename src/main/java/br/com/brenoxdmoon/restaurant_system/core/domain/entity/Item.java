package br.com.brenoxdmoon.restaurant_system.core.domain.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Item extends DomainEntity {

    private String name;
    private String code;
    private String description;
    private BigDecimal price;

}
