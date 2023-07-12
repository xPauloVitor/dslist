package com.dev.superior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.superior.dslist.dto.GameListDTO;
import com.dev.superior.dslist.dto.GameMinDTO;
import com.dev.superior.dslist.services.GameListService;
import com.dev.superior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListContoller {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
}
