package com.dev.superior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.superior.dslist.dto.GameMinDTO;
import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository  gamerepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gamerepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
