package br.com.brenoxdmoon.restaurant_system.inbound.command;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateItemDTO;
import br.com.brenoxdmoon.restaurant_system.core.ports.inbound.CreateItemUseCase;
import org.springframework.stereotype.Component;

@Component
public class CreateItemCommand {

    private final CreateItemUseCase useCase;

    public CreateItemCommand(CreateItemUseCase useCase) {
        this.useCase = useCase;
    }

    public void execute(CreateItemDTO dto) {
        useCase.createItem(dto);
    }
}
