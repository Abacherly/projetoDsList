package com.mariana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
 
}
