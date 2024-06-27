package br.com.brenoxdmoon.restaurant_system.core.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class CustomerCheck extends DomainEntity {

    @OneToMany
    List<Item> items;

    private String customerName;
    
    private BigDecimal getTotal(){
        return items.stream().map(Item::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
