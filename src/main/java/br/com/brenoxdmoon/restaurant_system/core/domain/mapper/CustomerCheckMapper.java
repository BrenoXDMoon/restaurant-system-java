package br.com.brenoxdmoon.restaurant_system.core.domain.mapper;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.CustomerCheck;
import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ItemMapper.class})
public interface CustomerCheckMapper {

    CustomerCheck toCustomerCheck(CreateCheckDTO dto);

}
