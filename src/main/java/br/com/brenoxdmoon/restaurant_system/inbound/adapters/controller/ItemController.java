package br.com.brenoxdmoon.restaurant_system.inbound.adapters.controller;

import br.com.brenoxdmoon.restaurant_system.core.dto.CreateItemDTO;
import br.com.brenoxdmoon.restaurant_system.inbound.command.CreateItemCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    private final CreateItemCommand command;

    @Autowired
    public ItemController(CreateItemCommand command) {
        this.command = command;
    }

    @PostMapping
    public ResponseEntity createItem(@RequestBody CreateItemDTO item) {
        command.execute(item);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
