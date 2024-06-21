package br.com.brenoxdmoon.restaurant_system.core.domain.service;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;
import br.com.brenoxdmoon.restaurant_system.core.ports.inbound.CreateCheckUseCase;
import br.com.brenoxdmoon.restaurant_system.core.ports.outbound.CheckRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCheckServiceImpl implements CreateCheckUseCase {

    public CreateCheckServiceImpl(CheckRepository repository) {
        this.repository = repository;
    }

    CheckRepository repository;

    @Override
    public Object createCheck(CreateCheckDTO createCheckDTO) {



        return null;
    }
}
