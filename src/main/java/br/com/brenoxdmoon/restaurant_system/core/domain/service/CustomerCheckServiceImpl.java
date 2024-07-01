package br.com.brenoxdmoon.restaurant_system.core.domain.service;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.CustomerCheck;
import br.com.brenoxdmoon.restaurant_system.core.domain.mapper.CustomerCheckMapper;
import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;
import br.com.brenoxdmoon.restaurant_system.core.ports.inbound.CreateCheckUseCase;
import br.com.brenoxdmoon.restaurant_system.core.ports.outbound.CustomerCheckRepository;
import br.com.brenoxdmoon.restaurant_system.core.ports.outbound.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerCheckServiceImpl implements CreateCheckUseCase {

    private final ItemRepository itemRepository;
    private final CustomerCheckMapper mapper;
    private final CustomerCheckRepository repository;

    public CustomerCheckServiceImpl(CustomerCheckRepository repository, CustomerCheckMapper mapper, ItemRepository itemRepository) {
        this.repository = repository;
        this.mapper = mapper;
        this.itemRepository = itemRepository;
    }

    @Override
    public void createCheck(CreateCheckDTO dto) {

        CustomerCheck customerCheck = mapper.toCustomerCheck(dto);
        customerCheck.getItems().replaceAll(item -> itemRepository.getItemByCode(item.getCode()));
        repository.save(customerCheck);
    }
}
