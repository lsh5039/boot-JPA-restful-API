package com.project.jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BoardJpaRepository extends JpaRepository<Board, Long>{

    @Query("SELECT b FROM Board b ORDER BY b.boardPk DESC")
    List<Board> findAllDesc();
}
