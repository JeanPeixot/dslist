package com.devjean.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjean.dslist.dto.GameMinDTO;
import com.devjean.dslist.entities.Game;
import com.devjean.dslist.respositories.GameRepository;

@Service
public class GameService {
	
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
}
