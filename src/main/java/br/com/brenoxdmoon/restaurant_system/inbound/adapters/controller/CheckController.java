package br.com.brenoxdmoon.restaurant_system.inbound.adapters.controller;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateCheckDTO;
import br.com.brenoxdmoon.restaurant_system.inbound.command.CreateCheckCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check")
public class CheckController {

    private final CreateCheckCommand createCheckCommand;

    @Autowired
    public CheckController(CreateCheckCommand createCheckCommand) {
        this.createCheckCommand = createCheckCommand;
    }

    @PostMapping
    public ResponseEntity createCheck(@RequestBody CreateCheckDTO createCheckDTO) {
        createCheckCommand.execute(createCheckDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
