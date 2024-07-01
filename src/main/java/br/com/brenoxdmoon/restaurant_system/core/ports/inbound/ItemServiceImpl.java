package br.com.brenoxdmoon.restaurant_system.core.ports.inbound;

import br.com.brenoxdmoon.restaurant_system.core.domain.mapper.CustomerCheckMapper;
import br.com.brenoxdmoon.restaurant_system.core.domain.mapper.ItemMapper;
import br.com.brenoxdmoon.restaurant_system.core.dto.CreateItemDTO;
import br.com.brenoxdmoon.restaurant_system.core.ports.outbound.CustomerCheckRepository;
import br.com.brenoxdmoon.restaurant_system.core.ports.outbound.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements CreateItemUseCase {

    private final ItemRepository itemRepository;
    private final ItemMapper mapper;

    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper mapper) {
        this.itemRepository = itemRepository;
        this.mapper = mapper;
    }

    @Override
    public void createItem(CreateItemDTO dto) {
        itemRepository.save(mapper.toItem(dto));
    }
}
