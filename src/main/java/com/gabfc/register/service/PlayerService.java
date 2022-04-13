package com.gabfc.register.service;

import com.gabfc.register.model.dto.PlayerCreate;
import com.gabfc.register.exception.NotFoundException;
import com.gabfc.register.model.Player;
import com.gabfc.register.repository.PlayerRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void create(PlayerCreate playerCreate){
        Player player = playerCreate.mapToPlayer();
        playerRepository.save(player);
    }


    public void delete(Long id){
        try{
            playerRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new NotFoundException(e.getMessage());
        }
    }


    public List<Player> findAll(){
        return playerRepository.findAll();
    }


}
