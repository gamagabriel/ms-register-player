package com.gabfc.register.controller;

import com.gabfc.register.model.dto.PlayerCreate;
import com.gabfc.register.model.Player;
import com.gabfc.register.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/create")
    public void create(@RequestBody PlayerCreate playerCreate){
        playerService.create(playerCreate);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){playerService.delete(id);}

    @GetMapping("/read-all")
    public List<Player> findAll(){
        return playerService.findAll();
    }
}
