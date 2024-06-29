package br.com.brenoxdmoon.restaurant_system.core.ports.outbound;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.Item;

public interface ItemRepository {
    Item getItemByCode(String code);
}
