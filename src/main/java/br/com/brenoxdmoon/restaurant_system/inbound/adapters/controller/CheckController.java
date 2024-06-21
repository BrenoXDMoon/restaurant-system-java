package br.com.brenoxdmoon.restaurant_system.inbound.adapters.controller;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;
import br.com.brenoxdmoon.restaurant_system.inbound.command.CreateCheckCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check")
public class CheckController {

    CreateCheckCommand createCheckCommand;

    public CheckController() {}

    public ResponseEntity createCheck(CreateCheckDTO createCheckDTO) {
        return ResponseEntity.ok().body(createCheckCommand.execute(createCheckDTO));
    }

}
