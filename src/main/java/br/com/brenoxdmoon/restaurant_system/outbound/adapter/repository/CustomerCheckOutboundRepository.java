package br.com.brenoxdmoon.restaurant_system.outbound.adapter.repository;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.CustomerCheck;
import br.com.brenoxdmoon.restaurant_system.core.ports.outbound.CustomerCheckRepository;
import br.com.brenoxdmoon.restaurant_system.outbound.adapter.repository.jpa.CustomerCheckJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class CustomerCheckOutboundRepository implements CustomerCheckRepository {

    private final CustomerCheckJpaRepository repository;

    public CustomerCheckOutboundRepository(CustomerCheckJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(CustomerCheck customerCheck) {
        repository.save(customerCheck);
    }
}
