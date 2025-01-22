package com.devjean.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjean.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
