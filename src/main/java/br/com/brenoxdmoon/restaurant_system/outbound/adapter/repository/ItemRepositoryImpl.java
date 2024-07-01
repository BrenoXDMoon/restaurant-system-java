package br.com.brenoxdmoon.restaurant_system.outbound.adapter.repository;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.Item;
import br.com.brenoxdmoon.restaurant_system.core.ports.outbound.ItemRepository;
import br.com.brenoxdmoon.restaurant_system.outbound.adapter.repository.jpa.ItemJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class ItemRepositoryImpl implements ItemRepository {

    private final ItemJpaRepository repository;

    public ItemRepositoryImpl(ItemJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Item getItemByCode(String code) {
        //TODO: adicionar tratamento para casos de não encontrado
        return repository.findByCode(code).orElseThrow(NullPointerException::new);
    }

    @Override
    public void save(Item item) {
        repository.save(item);
    }
}
