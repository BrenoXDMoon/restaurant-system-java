package br.com.brenoxdmoon.restaurant_system.inbound.command;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;
import br.com.brenoxdmoon.restaurant_system.core.ports.inbound.CreateCheckUseCase;
import org.springframework.stereotype.Component;

@Component
public class CreateCheckCommand {

    private final CreateCheckUseCase useCase;

    public CreateCheckCommand(CreateCheckUseCase useCase) {
        this.useCase = useCase;
    }

    public void execute(CreateCheckDTO dto) {
        useCase.createCheck(dto);
    }
}
