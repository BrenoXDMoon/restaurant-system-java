package br.com.brenoxdmoon.restaurant_system.inbound.command;

import br.com.brenoxdmoon.restaurant_system.core.dto.AbstractDTO;

public interface Command {

    AbstractDTO execute(AbstractDTO dto);

}
