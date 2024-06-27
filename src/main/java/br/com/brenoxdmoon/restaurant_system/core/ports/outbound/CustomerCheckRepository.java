package br.com.brenoxdmoon.restaurant_system.core.ports.outbound;

import br.com.brenoxdmoon.restaurant_system.core.domain.entity.CustomerCheck;

public interface CustomerCheckRepository {
    void save(CustomerCheck customerCheck);
}
