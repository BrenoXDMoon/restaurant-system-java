package br.com.brenoxdmoon.restaurant_system.core.domain.mapper;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.Item;
import br.com.brenoxdmoon.restaurant_system.core.dto.ItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    @Mapping(target = "code", source = "productCode")
    Item toItem(ItemDTO dto);

    @Mapping(target = "productCode", source = "code")
    ItemDTO toItemDTO(Item item);

}
