package com.devjean.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjean.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
