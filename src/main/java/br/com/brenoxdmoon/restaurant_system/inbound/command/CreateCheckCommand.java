package br.com.brenoxdmoon.restaurant_system.inbound.command;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;
import br.com.brenoxdmoon.restaurant_system.core.ports.inbound.CreateCheckUseCase;
import org.springframework.stereotype.Component;

@Component
public class CreateCheckCommand {

    CreateCheckUseCase useCase;

    //TODO: Alterar retorno Object para uma classe DTO
    public Object execute(CreateCheckDTO createCheckDTO) {
        return useCase.createCheck(createCheckDTO);
    }
}
