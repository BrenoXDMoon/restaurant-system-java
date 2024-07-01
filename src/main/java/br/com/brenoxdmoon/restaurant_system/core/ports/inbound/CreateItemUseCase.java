package br.com.brenoxdmoon.restaurant_system.core.ports.inbound;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateItemDTO;

public interface CreateItemUseCase {
    void createItem(CreateItemDTO dto);
}
