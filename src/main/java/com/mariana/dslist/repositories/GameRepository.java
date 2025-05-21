package com.mariana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
 
}
