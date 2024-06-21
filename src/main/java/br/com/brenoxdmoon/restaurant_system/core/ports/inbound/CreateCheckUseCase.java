package br.com.brenoxdmoon.restaurant_system.core.ports.inbound;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;

public interface CreateCheckUseCase {
    Object createCheck(CreateCheckDTO createCheckDTO);
}
